package exercices.design_patterns.command.pilot;

import exercices.design_patterns.command.polecenie.Polecenie;

public class MiniPilot {
  private Polecenie gniazdo;

  public MiniPilot() {
  }

  public void ustawPolecenie(Polecenie polecenie) {
    this.gniazdo = polecenie;
  }

  public void przyciskZostalNacisniety() {
    this.gniazdo.wykonaj();
  }
}
