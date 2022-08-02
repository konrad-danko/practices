package exercices.design_patterns.state;

public class AutomatSprzedajacy {
  private final Stan stanBrakGum;
  private final Stan stanNieMaMonety;
  private final Stan stanJestMoneta;
  private final Stan stanGumaSprzedana;
  private final Stan stanWygrana;

  private Stan stan;
  private int liczbaGum;

  public AutomatSprzedajacy(int liczbaGum){
    stanBrakGum = new StanBrakGum(this);
    stanNieMaMonety = new StanNieMaMonety(this);
    stanJestMoneta = new StanJestMoneta(this);
    stanGumaSprzedana = new StanGumaSprzedana(this);
    stanWygrana = new StanWygrana(this);
    this.liczbaGum = liczbaGum;
    if (liczbaGum > 0) {
      stan = stanNieMaMonety;
    } else {
      stan = stanBrakGum;
    }
  }

  public void wlozMonete(){
    stan.wlozMonete();
  }

  public void zwrocMonete(){
    stan.zwrocMonete();
  }

  public void przekrecGalke(){
    stan.przekrecGalke();
    stan.wydaj();
  }

  void ustawStan(Stan stan){
    this.stan = stan;
  }

  public void napelnij(int liczbaGum) {
    this.liczbaGum = this.liczbaGum + liczbaGum;
    System.out.println("Automat ponownie napełniono. Liczba gum: " + this.liczbaGum);
    stan.napelnij();
  }

  void zwolnijGume(){
    System.out.println("Wypada guma");
    if (liczbaGum > 0) {
      liczbaGum = liczbaGum - 1;
    }
  }

  public Stan pobierzStanBrakGum() {
    return stanBrakGum;
  }

  public Stan pobierzStanNieMaMonety() {
    return stanNieMaMonety;
  }

  public Stan pobierzStanJestMoneta() {
    return stanJestMoneta;
  }

  public Stan pobierzStanGumaSprzedana() {
    return stanGumaSprzedana;
  }

  public Stan pobierzStanWygrana() {
    return stanWygrana;
  }

  public Stan pobierzStan() {
    return stan;
  }

  public int pobierzLiczbaGum() {
    return liczbaGum;
  }

  @Override
  public String toString() {
    return "AutomatSprzedajacy{" + "stan=" + stan.getClass().getSimpleName() +
        ", liczbaGum=" + liczbaGum +'}';
  }
}
