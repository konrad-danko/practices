package exercices.design_patterns.command.polecenie;

import exercices.design_patterns.command.urzadzenia.Swiatlo;

public class PolecenieWylaczSwiatlo implements Polecenie{

  private Swiatlo swiatlo;

  public PolecenieWylaczSwiatlo(Swiatlo swiatlo) {
    this.swiatlo = swiatlo;
  }

  @Override
  public void wykonaj() {
    this.swiatlo.wylacz();
  }

  @Override
  public void wycofaj() {
    this.swiatlo.wlacz();
  }
}
