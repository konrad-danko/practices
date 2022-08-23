package exercices.design_patterns.compound_pattern.model_kaczki;

import exercices.design_patterns.compound_pattern.obserwator.Obserwator;
import exercices.design_patterns.compound_pattern.obserwowany.Obserwowany;

public class KrzyzowkaKaczka implements Kwaczaca {
  private final Obserwowany obserwowany;

  public KrzyzowkaKaczka() {
    obserwowany = new Obserwowany(this);
  }

  @Override
  public void kwacz() {
    System.out.println("Kaczka Krzyzowka robi: Kwa! Kwa!");
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
