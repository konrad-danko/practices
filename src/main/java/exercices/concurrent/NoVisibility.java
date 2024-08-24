package exercices.concurrent;

public class NoVisibility {
  private static boolean ready;
  private static int number;
  private static long start = System.currentTimeMillis();

  private static class ReaderThread extends Thread{
    public void run(){
      System.out.println("From ReaderThread 01: " + (System.currentTimeMillis() - start));
      while (!ready){
        Thread.yield();
        System.out.println(number);
      }
      System.out.println("From ReaderThread 02: " + (System.currentTimeMillis() - start));
    }
  }

  public static void main(String[] args) {
    System.out.println("From main 01: " + (System.currentTimeMillis() - start));
    new ReaderThread().start();
    number = 42;
    ready = true;
    System.out.println("From main 02: " + (System.currentTimeMillis() - start));
  }




}
