package exercices.design_patterns.adapter.adaptery;

import exercices.design_patterns.adapter.indyki.Indyk;
import exercices.design_patterns.adapter.kaczki.Kaczka;

public class IndykAdapter implements Kaczka {

  private Indyk indyk;

  public IndykAdapter(Indyk indyk) {
    this.indyk = indyk;
  }

  @Override
  public void kwacz() {
    this.indyk.gulgocz();
  }

  @Override
  public void lecJakKaczka() {
    for (int i=0; i<5; i++) {
      this.indyk.lecJakIndyk();
    }
  }
}
