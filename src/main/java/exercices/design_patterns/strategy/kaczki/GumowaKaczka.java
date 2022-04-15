package exercices.design_patterns.strategy.kaczki;

import exercices.design_patterns.strategy.interfejsy.kwakanie.Piszcz;
import exercices.design_patterns.strategy.interfejsy.latanie.NieLatam;

public class GumowaKaczka extends Kaczka {

  public GumowaKaczka() {
    System.out.println("\n" + this.getClass().getSimpleName());
    this.setLatanieInterfejs(new NieLatam());
    this.setKwakanieInterfejs(new Piszcz());
  }

  @Override
  public void wyswietl() {
    System.out.println("Wyglądam jak Gumowa Kaczka");
  }
}
