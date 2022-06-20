package exercices.design_patterns.command.urzadzenia;

public class WiezaStereo {

  public void wlacz(){
    System.out.println("Włączam wieżę stereo - ON");
  }

  public void wylacz(){
    System.out.println("Wyłączam wieżę stereo - OFF");
  }

  public void ustawCD(){
    System.out.println("Ustawiam CD");
  }

  public void ustawDVD(){
    System.out.println("Ustawiam DVD");
  }

  public void ustawRadio(){
    System.out.println("Ustawiam radio");
  }

  public void ustawGlosnosc(int poziom){
    System.out.println("Ustawiam głośność na " + poziom);
  }
}
