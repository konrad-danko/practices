package exercices.design_patterns.strategy.kaczki;

import exercices.design_patterns.strategy.interfejsy.kwakanie.KwakanieInterfejs;
import exercices.design_patterns.strategy.interfejsy.latanie.LatanieInterfejs;
import lombok.Setter;

@Setter
public abstract class Kaczka {

  private LatanieInterfejs latanieInterfejs;
  private KwakanieInterfejs kwakanieInterfejs;

  public abstract void wyswietl();

  public void wykonajLatanie() {
    latanieInterfejs.lec();
  }

  public void wykonajKwakanie() {
    kwakanieInterfejs.kwacz();
  }

  public void plyn() {
    System.out.println("Wszystkie kaczki pływają, także ja: "+ this.getClass().getSimpleName());
  }
}
