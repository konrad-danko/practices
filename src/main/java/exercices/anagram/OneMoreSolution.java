package exercices.anagram;

import java.util.*;

public class OneMoreSolution {

  private static List<String> inputData = List.of("abc", "bca", "cab", "cba", "abca", "qwe", "qwe", "weq", "eqw", "gt", "tg", "ed", "tyu", "uyt", "ytu");

  public static void main(String[] args) {
    System.out.println(inputData);
    System.out.println(getListsOfAnagrams(inputData));
  }

  private static List<List<String>> getListsOfAnagrams(List<String> stringList){
    Map<String, List<String>> map = new HashMap();
    stringList.stream()
        .forEach(s-> upsert(map, s));
    return List.copyOf(map.values());
  }

  private static String getAnagramKey(String str){
    int[] chars = str.chars().toArray();
    Arrays.sort(chars);
    return Arrays.toString(chars);
  }

  private static void upsert(Map<String, List<String>> map, String str){
    String key = getAnagramKey(str);
    List<String> list = map.get(key) == null? new ArrayList<>(): map.get(key);
    list.add(str);
    map.put(key, list);
  }


}
