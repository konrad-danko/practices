package exercices.design_patterns.adapter.indyki;

public class DzikiIndyk implements Indyk{
  @Override
  public void gulgocz() {
    System.out.println("Gul, gul, gul!");
  }

  @Override
  public void lecJakIndyk() {
    System.out.println("Latam, ale tylko na krótkie dystanse!");
  }
}
