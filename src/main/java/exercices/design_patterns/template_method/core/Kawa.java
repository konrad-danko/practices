package exercices.design_patterns.template_method.core;

public class Kawa extends GoracyNapoj{
  @Override
  public void zaparzanie() {
    System.out.println("Zaparzamy kawę");
  }

  @Override
  public void domieszanieDodatkow() {
    System.out.println("Dodajemy cukier i mleko");
  }
}
