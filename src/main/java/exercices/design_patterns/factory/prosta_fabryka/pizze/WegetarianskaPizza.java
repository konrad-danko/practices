package exercices.design_patterns.factory.prosta_fabryka.pizze;

public class WegetarianskaPizza implements Pizza{
  @Override
  public void przygotowanie() {
    System.out.println("Przygotowujemy pizzę wegetariańską!");
  }

  @Override
  public void pieczenie() {
    System.out.println("Pieczemy pizzę wegetariańską!");
  }

  @Override
  public void krojenie() {
    System.out.println("Kroimy pizzę wegetariańską!");
  }

  @Override
  public void pakowanie() {
    System.out.println("Pakujemy pizzę wegetariańską!");
  }
}
