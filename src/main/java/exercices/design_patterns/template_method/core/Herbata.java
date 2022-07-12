package exercices.design_patterns.template_method.core;

public class Herbata extends GoracyNapoj{
  @Override
  public void zaparzanie() {
    System.out.println("Zaparzamy herbatę");
  }

  @Override
  public void domieszanieDodatkow() {
    System.out.println("Dodajemy cukier i cytrynę");
  }
}
