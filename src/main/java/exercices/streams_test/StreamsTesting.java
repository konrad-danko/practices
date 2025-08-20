package exercices.streams_test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsTesting {

  private static final long START_TIME = System.currentTimeMillis();

  public static void main(String[] args) {
    List<Integer> integerList = createIntegerList(20);
    logEvent("List of integers completed");

//    List<Integer> resultList = integerList.stream() // this one looks to be 2.5 times slower
    List<Integer> resultList = integerList.parallelStream() // this one looks to be 2.5 times faster
        .map(i -> executeSomeProcess(1, i))
        .map(i -> executeSomeProcess(2, i))
        .map(i -> executeSomeProcess(3, i))
        .map(i -> executeSomeProcess(4, i))
        .map(i -> executeSomeProcess(5, i))
        .map(i -> executeSomeProcess(6, i))
        .collect(Collectors.toList());
    System.out.println(resultList);
    logEvent("Main method completed");
  }

  private static List<Integer> createIntegerList(int size){
    List<Integer> resultList = new ArrayList<>();
    for (int index=1; index<=size; index++) {
      resultList.add(index);
    }
    return resultList;
  }

  private static void logEvent(String message){
    String qqq = String.format("%s in %s ms", message, getTimeStamp());
    System.out.println(qqq);
  }

  private static long getTimeStamp(){
    return System.currentTimeMillis() - START_TIME;
  }

  private static void doSomeLongRunningProcess(){ // runs ~700 ms
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < 50 * 1000 * 1000; i++) {
      set.add(i % 500);
    }
  }

  private static Integer executeSomeProcess(int step, Integer item){
    doSomeLongRunningProcess();
    String message = String.format("Stream process no %s, list item no %s completed", step, item);
    logEvent(message);
    return item;
  }
}
