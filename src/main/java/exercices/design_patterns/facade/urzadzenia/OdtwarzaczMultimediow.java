package exercices.design_patterns.facade.urzadzenia;

public class OdtwarzaczMultimediow {
  private Wzmacniacz wzmacniacz;

  public void wlacz(){
    System.out.println("Włączam odtwarzacz!");
  }

  public void wylacz(){
    System.out.println("Wyłączam odtwarzacz!");
  }

  public void odtwarzajFilm(String film){
    System.out.println("Rozpoczynam projekcję filmu " + film);
  }

  public void zatrzymaj(){
    System.out.println("Wstrzymuję odtwarzanie aktualnego filmu");
  }
}
