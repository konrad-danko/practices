package exercices.design_patterns.facade.urzadzenia;

public class MaszynkaPopcorn {

  public void wlacz(){
    System.out.println("Włączam maszynkę do popcornu!");
  }

  public void wylacz(){
    System.out.println("Wyłączam maszynkę do popcornu!");
  }

  public void przygotujPopcorn(){
    System.out.println("Prażymy mnóstwo popcornu!");
  }
}
