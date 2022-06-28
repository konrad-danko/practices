package exercices.design_patterns.facade.urzadzenia;

public class Wzmacniacz {
  private Tuner tuner;
  private OdtwarzaczMultimediow odtwarzacz;

  public void wlacz(){
    System.out.println("Włączam wzmacniacz!");
  }

  public void wylacz(){
    System.out.println("Wyłączam wzmacniacz!");
  }

  public void ustawOdtwarzacz(OdtwarzaczMultimediow odtwarzacz){
    this.odtwarzacz = odtwarzacz;
    System.out.println("Ustawiam odtwarzacz");
  }

  public void ustawDzwiekStereo(){
    System.out.println("Ustawiam dzwięk stereo!");
  }

  public void ustawDzwiekPrzestrzenny(){
    System.out.println("Ustawiam dzwięk przestrzenny!");
  }

  public void ustawTuner (Tuner tuner){
    this.tuner = tuner;
    System.out.println("Ustawiam tuner");
  }
  public void ustawGlosnosc(int glosnosc){
    System.out.println("Ustawiam głośność na " + glosnosc);
  }
}
