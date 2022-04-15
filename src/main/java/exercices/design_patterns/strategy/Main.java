package exercices.design_patterns.strategy;

import exercices.design_patterns.strategy.interfejsy.kwakanie.Kwacz;
import exercices.design_patterns.strategy.interfejsy.kwakanie.NieKwacz;
import exercices.design_patterns.strategy.kaczki.Kaczka;
import exercices.design_patterns.strategy.kaczki.KrzyzowkaKaczka;
import exercices.design_patterns.strategy.kaczki.GumowaKaczka;

public class Main {
  public static void main(String[] args) {
    runAllMethods(new KrzyzowkaKaczka());
    runAllMethods(new GumowaKaczka());

    Kaczka krzyzowka = new KrzyzowkaKaczka();
    runAllMethods(krzyzowka);
    krzyzowka.setKwakanieInterfejs(new NieKwacz());
    krzyzowka.wykonajKwakanie();

    Kaczka modelowa = new GumowaKaczka();
    runAllMethods(modelowa);
    modelowa.setKwakanieInterfejs(new Kwacz());
    modelowa.wykonajKwakanie();
  }

  private static void runAllMethods(Kaczka kaczka){
    kaczka.wyswietl();
    kaczka.wykonajKwakanie();
    kaczka.wykonajLatanie();
    kaczka.plyn();
  }
}
