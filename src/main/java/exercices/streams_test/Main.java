package exercices.streams_test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {

    long start = System.currentTimeMillis();
    List<Long> integerList = createIntegerList(100);
    System.out.println("Time stamp: Original list created in " + (System.currentTimeMillis()-start) + " ms");
    System.out.println("Is it sorted: " + isSorted(integerList));
    System.out.println("Time stamp: Original list checked if sorted in " + (System.currentTimeMillis()-start) + " ms");

    System.out.println("\nProcessing the list");
    List<Long> processedList = integerList.parallelStream()
        .map(n -> System.nanoTime())
        .collect(Collectors.toList());
    System.out.println("Is it sorted: " + isSorted(processedList));
    System.out.println("Time stamp: Processed list checked if sorted in " + (System.currentTimeMillis()-start) + " ms");


    System.out.println("\nProcessing the list once more");
    List<Long> newestList = new ArrayList<>();
    integerList.forEach(n-> newestList.add(System.nanoTime()));
    System.out.println("Is it sorted: " + isSorted(newestList));
    System.out.println("Time stamp: The newest list checked if sorted in " + (System.currentTimeMillis()-start) + " ms");


    System.out.println("The list size is: " + integerList.size());
  }

  private static boolean isSorted(List<Long> list){
    int size = list.size();
    for(int index=1; index<size; index++){
      if (list.get(index)<= list.get(index-1)) {
        return false;
      }
    }
    return true;
  }

  private static List<Long> createIntegerList(int size){
    List<Long> resultList = new ArrayList<>();
    for (long index=0; index<size; index++) {
      resultList.add(index);
    }
    return resultList;
  }
}
