package exercices.design_patterns.command.urzadzenia;

public class WentylatorSufitowy {
  public static final int WYSOKA = 3;
  public static final int SREDNIA = 2;
  public static final int NISKA = 1;
  public static final int WYLACZONY = 0;
  private String pomieszczenie;
  private int predkosc;

  public WentylatorSufitowy(String pomieszczenie) {
    this.pomieszczenie = pomieszczenie;
    this.predkosc = WYLACZONY;
  }

  public void wysokieObroty(){
    this.predkosc = WYSOKA;
    System.out.println("Włączam wysokie obroty wentylatora");
  }

  public void srednieObroty(){
    this.predkosc = SREDNIA;
    System.out.println("Włączam średnie obroty wentylatora");
  }

  public void niskieObroty(){
    this.predkosc = NISKA;
    System.out.println("Włączam niskie obroty wentylatora");
  }

  public void wylacz(){
    this.predkosc = WYLACZONY;
    System.out.println("Wyłączam wentylator");
  }

  public int pobierzPredkosc(){
    return this.predkosc;
  }
}
