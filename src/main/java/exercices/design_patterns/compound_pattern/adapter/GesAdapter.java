package exercices.design_patterns.compound_pattern.adapter;

import exercices.design_patterns.compound_pattern.model_kaczki.Kwaczaca;
import exercices.design_patterns.compound_pattern.obserwator.Obserwator;
import exercices.design_patterns.compound_pattern.obserwowany.Obserwowany;

public class GesAdapter implements Kwaczaca {
  private final Ges ges;
  private final Obserwowany obserwowany;

  public GesAdapter(Ges ges) {
    this.ges = ges;
    obserwowany = new Obserwowany(this);
  }

  @Override
  public void kwacz() {
    ges.gegaj();
    powiadomObserwatory();
  }

  @Override
  public void zarejestrujObserwator(Obserwator obserwator) {
    obserwowany.zarejestrujObserwator(obserwator);
  }

  @Override
  public void powiadomObserwatory() {
    obserwowany.powiadomObserwatory();
  }
}
