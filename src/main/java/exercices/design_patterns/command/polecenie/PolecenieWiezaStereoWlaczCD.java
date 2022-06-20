package exercices.design_patterns.command.polecenie;

import exercices.design_patterns.command.urzadzenia.WiezaStereo;

public class PolecenieWiezaStereoWlaczCD implements Polecenie{

  private WiezaStereo wiezaStereo;

  public PolecenieWiezaStereoWlaczCD(WiezaStereo wiezaStereo) {
    this.wiezaStereo = wiezaStereo;
  }
  
  @Override
  public void wykonaj() {
    this.wiezaStereo.wlacz();
    this.wiezaStereo.ustawCD();
    this.wiezaStereo.ustawGlosnosc(11);
  }

  @Override
  public void wycofaj() {
    this.wiezaStereo.wylacz();
  }
}
