package exercices.design_patterns.facade.urzadzenia;

public class OswietlenieKinowe {

  public void wlacz(){
    System.out.println("Włączam oświetlenie kinowe!");
  }

  public void wylacz(){
    System.out.println("Wyłączam oświetlenie kinowe!");
  }

  public void sciemniaj(int poziom){
    System.out.println("Ściemniam oświetlenie do poziomu: " + poziom + "%");
  }
}
