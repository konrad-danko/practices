package exercices.anagram;

import java.util.*;
import java.util.stream.Collectors;

public class CitiTaskAnagram {
  public static void main(String[] args) {

    List<String> sourceList = Arrays.asList("abc", "bca", "acb", "", null, "abc", "Aba", "qwe", "ewq", "weq", "zxc");
    System.out.println(getCountOfAnagramsLoop(sourceList));
    System.out.println(getCountOfAnagramsStream(sourceList));

    System.out.println(getListOfAnagramsLoop(sourceList));
    System.out.println(getListOfAnagramsStream(sourceList));

  }

  private static Map<String, List<String>> getListOfAnagramsLoop(List<String> sourceList){
    Map<String, List<String>> resultMap = new HashMap<>();
    for (String str: sourceList) {
      if (str==null || str.length()==0) continue;
      String key = getSortedString(str);
      List<String> value = resultMap.get(key);
      value = value==null? new ArrayList<>(): value;
      value.add(str);
      resultMap.put(key, value);
    }
    return resultMap;
  }
  private static Map<String, List<String>> getListOfAnagramsStream(List<String> sourceList){
    return sourceList.stream()
        .filter(s-> s!=null && s.length()>0)
        .collect(Collectors.groupingBy(CitiTaskAnagram::getSortedString));
  }

  private static Map<String, Integer> getCountOfAnagramsLoop(List<String> sourceList){
    Map<String, Integer> resultMap = new HashMap<>();
    for (String str: sourceList) {
      if (str==null || str.length()==0) continue;
      String key = getSortedString(str);
      Integer value = resultMap.get(key);
      value = value==null? 1: value + 1;
      resultMap.put(key, value);
    }
    return resultMap;
  }
  private static Map<String, Integer> getCountOfAnagramsStream(List<String> sourceList){
    return sourceList.stream()
        .filter(s-> s!=null && s.length()>0)
        .collect(Collectors.groupingBy(CitiTaskAnagram::getSortedString, Collectors.summingInt(n->1)));
  }

  private static String getSortedString(String string){
    return string.chars()
        .mapToObj(i-> "" + (char)i)
        .map(String::toLowerCase)
        .sorted()
        .collect(Collectors.joining(""));
  }
}
