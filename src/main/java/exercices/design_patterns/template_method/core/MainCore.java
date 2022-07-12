package exercices.design_patterns.template_method.core;

public class MainCore {
  public static void main(String[] args) {
    System.out.println("\n Przygotowanie herbaty\n");
    Herbata herbata = new Herbata();
    herbata.recepturaParzenia();

    System.out.println("\n\n Przygotowanie kawy\n");
    Kawa kawa = new Kawa();
    kawa.recepturaParzenia();
  }
}
