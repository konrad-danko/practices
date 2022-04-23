package exercices.design_patterns.factory.prosta_fabryka.pizze;

public class SerowaPizza implements Pizza{
  @Override
  public void przygotowanie() {
    System.out.println("Przygotowujemy pizzę serową!");
  }

  @Override
  public void pieczenie() {
    System.out.println("Pieczemy pizzę serową!");
  }

  @Override
  public void krojenie() {
    System.out.println("Kroimy pizzę serową!");
  }

  @Override
  public void pakowanie() {
    System.out.println("Pakujemy pizzę serową!");
  }
}
