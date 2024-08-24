package exercices.concurrent;

public class SequenceMain {

  private static int value = 10;

  public static void main(String[] args) {
    System.out.println(value);
    System.out.println(getNextValue());
    System.out.println(value);
  }

  private synchronized static int getNextValue(){
    return value++; //10, 10, 11
    //return ++value; //10, 11, 11
  }



}
