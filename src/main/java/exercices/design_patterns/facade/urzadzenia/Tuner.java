package exercices.design_patterns.facade.urzadzenia;

public class Tuner {
  private Wzmacniacz wzmacniacz;

  public void wlacz(){
    System.out.println("Włączam tuner!");
  }

  public void wylacz(){
    System.out.println("Wyłączam tuner!");
  }
}
