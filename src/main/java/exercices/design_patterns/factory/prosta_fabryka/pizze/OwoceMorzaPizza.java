package exercices.design_patterns.factory.prosta_fabryka.pizze;

public class OwoceMorzaPizza implements Pizza{
  @Override
  public void przygotowanie() {
    System.out.println("Przygotowujemy pizzę z owoców morza!");
  }

  @Override
  public void pieczenie() {
    System.out.println("Pieczemy pizzę z owoców morza!");
  }

  @Override
  public void krojenie() {
    System.out.println("Kroimy pizzę z owoców morza!");
  }

  @Override
  public void pakowanie() {
    System.out.println("Pakujemy pizzę z owoców morza!");
  }
}
