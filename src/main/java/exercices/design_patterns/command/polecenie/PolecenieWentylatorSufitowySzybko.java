package exercices.design_patterns.command.polecenie;

import exercices.design_patterns.command.urzadzenia.WentylatorSufitowy;

public class PolecenieWentylatorSufitowySzybko implements Polecenie{

  private WentylatorSufitowy wentylatorSufitowy;
  int poprzedniaPredkosc;

  public PolecenieWentylatorSufitowySzybko(WentylatorSufitowy wentylatorSufitowy) {
    this.wentylatorSufitowy = wentylatorSufitowy;
  }

  @Override
  public void wykonaj() {
    this.poprzedniaPredkosc = this.wentylatorSufitowy.pobierzPredkosc();
    this.wentylatorSufitowy.wysokieObroty();
  }

  @Override
  public void wycofaj() {
    if (this.poprzedniaPredkosc == WentylatorSufitowy.WYSOKA) {
      this.wentylatorSufitowy.wysokieObroty();
    }
    if (this.poprzedniaPredkosc == WentylatorSufitowy.SREDNIA) {
      this.wentylatorSufitowy.srednieObroty();
    }
    if (this.poprzedniaPredkosc == WentylatorSufitowy.NISKA) {
      this.wentylatorSufitowy.niskieObroty();
    }
    if (this.poprzedniaPredkosc == WentylatorSufitowy.WYLACZONY) {
      this.wentylatorSufitowy.wylacz();
    }
  }
}
