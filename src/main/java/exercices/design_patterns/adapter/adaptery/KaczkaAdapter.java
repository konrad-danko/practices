package exercices.design_patterns.adapter.adaptery;

import exercices.design_patterns.adapter.indyki.Indyk;
import exercices.design_patterns.adapter.kaczki.Kaczka;

public class KaczkaAdapter implements Indyk {

  private Kaczka kaczka;

  public KaczkaAdapter(Kaczka kaczka) {
    this.kaczka = kaczka;
  }

  @Override
  public void gulgocz() {
    this.kaczka.kwacz();
  }

  @Override
  public void lecJakIndyk() {
    this.kaczka.lecJakKaczka();
  }
}
