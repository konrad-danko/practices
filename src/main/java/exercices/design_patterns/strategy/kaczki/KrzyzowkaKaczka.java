package exercices.design_patterns.strategy.kaczki;

import exercices.design_patterns.strategy.interfejsy.kwakanie.Kwacz;
import exercices.design_patterns.strategy.interfejsy.latanie.LatamBoMamSkrzydla;

public class KrzyzowkaKaczka extends Kaczka {

  public KrzyzowkaKaczka(){
    System.out.println("\n" + this.getClass().getSimpleName());
    this.setLatanieInterfejs(new LatamBoMamSkrzydla());
    this.setKwakanieInterfejs(new Kwacz());
  }

  @Override
  public void wyswietl() {
    System.out.println("Wyglądam jak kaczka Krzyżówka");
  }
}
