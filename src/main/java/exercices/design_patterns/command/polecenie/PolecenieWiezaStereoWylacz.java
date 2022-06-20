package exercices.design_patterns.command.polecenie;

import exercices.design_patterns.command.urzadzenia.WiezaStereo;

public class PolecenieWiezaStereoWylacz implements Polecenie{

  private WiezaStereo wiezaStereo;

  public PolecenieWiezaStereoWylacz(WiezaStereo wiezaStereo) {
    this.wiezaStereo = wiezaStereo;
  }

  @Override
  public void wykonaj() {
    this.wiezaStereo.wylacz();
  }

  @Override
  public void wycofaj() {
    this.wiezaStereo.wlacz();
    this.wiezaStereo.ustawCD();
    this.wiezaStereo.ustawGlosnosc(11);
  }
}
