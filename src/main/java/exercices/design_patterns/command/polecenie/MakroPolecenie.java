package exercices.design_patterns.command.polecenie;

public class MakroPolecenie implements Polecenie{

  private Polecenie[] polecenia;

  public MakroPolecenie(Polecenie[] polecenia) {
    this.polecenia = polecenia;
  }

  @Override
  public void wykonaj() {
    for (Polecenie polecenie: this.polecenia) {
      polecenie.wykonaj();
    }
  }

  @Override
  public void wycofaj() {
    for (Polecenie polecenie: this.polecenia) {
      polecenie.wycofaj();
    }
  }
}
