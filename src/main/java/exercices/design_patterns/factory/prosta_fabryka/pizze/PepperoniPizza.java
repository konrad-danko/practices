package exercices.design_patterns.factory.prosta_fabryka.pizze;

public class PepperoniPizza implements Pizza{
  @Override
  public void przygotowanie() {
    System.out.println("Przygotowujemy pizzę pepperoni!");
  }

  @Override
  public void pieczenie() {
    System.out.println("Pieczemy pizzę pepperoni!");
  }

  @Override
  public void krojenie() {
    System.out.println("Kroimy pizzę pepperoni!");
  }

  @Override
  public void pakowanie() {
    System.out.println("Pakujemy pizzę pepperoni!");
  }
}
