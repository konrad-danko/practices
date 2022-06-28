package exercices.design_patterns.facade.urzadzenia;

public class Projektor {
  private OdtwarzaczMultimediow odtwarzacz;

  public void wlacz(){
    System.out.println("Włączam projektor!");
  }

  public void wylacz(){
    System.out.println("Wyłączam projektor!");
  }

  public void trybSzerokoekranowy(){
    System.out.println("Ustawiam tryb szerokoekranowy");
  }
}
