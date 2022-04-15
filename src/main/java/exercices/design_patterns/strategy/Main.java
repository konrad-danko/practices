package exercices.design_patterns.strategy;

import exercices.design_patterns.strategy.interfejsy.kwakanie.Kwacz;
import exercices.design_patterns.strategy.interfejsy.kwakanie.NieKwacz;
import exercices.design_patterns.strategy.kaczki.Kaczka;
import exercices.design_patterns.strategy.kaczki.KrzyzowkaKaczka;
import exercices.design_patterns.strategy.kaczki.ModelowaKaczka;

public class Main {
  public static void main(String[] args) {
    runAllMethods(new KrzyzowkaKaczka());
    runAllMethods(new ModelowaKaczka());

    System.out.println("-------");
    Kaczka krzyzowka = new KrzyzowkaKaczka();
    krzyzowka.wyswietl();
    krzyzowka.wykonajKwakanie();
    krzyzowka.wykonajLatanie();
    krzyzowka.plyn();

    krzyzowka.setKwakanieInterfejs(new NieKwacz());
    krzyzowka.wykonajKwakanie();

    System.out.println("-------");
    Kaczka modelowa = new ModelowaKaczka();
    modelowa.wyswietl();
    modelowa.wykonajKwakanie();
    modelowa.wykonajLatanie();
    modelowa.plyn();

    modelowa.setKwakanieInterfejs(new Kwacz());
    modelowa.wykonajKwakanie();
  }

  private static void runAllMethods(Kaczka kaczka){
    kaczka.wyswietl();
    kaczka.plyn();
    kaczka.wykonajKwakanie();
    kaczka.wykonajLatanie();
  }
}
