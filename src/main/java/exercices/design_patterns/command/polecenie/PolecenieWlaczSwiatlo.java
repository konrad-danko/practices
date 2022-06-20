package exercices.design_patterns.command.polecenie;

import exercices.design_patterns.command.urzadzenia.Swiatlo;

public class PolecenieWlaczSwiatlo implements Polecenie{

  private Swiatlo swiatlo;

  public PolecenieWlaczSwiatlo(Swiatlo swiatlo) {
    this.swiatlo = swiatlo;
  }

  @Override
  public void wykonaj() {
    this.swiatlo.wlacz();
  }

  @Override
  public void wycofaj() {
    this.swiatlo.wylacz();
  }
}
