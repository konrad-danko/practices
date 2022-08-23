package exercices.design_patterns.compound_pattern.model_kaczki;

import exercices.design_patterns.compound_pattern.obserwator.Obserwator;
import exercices.design_patterns.compound_pattern.obserwowany.Obserwowany;

public class GumowaKaczka implements Kwaczaca {
  private final Obserwowany obserwowany;

  public GumowaKaczka() {
    obserwowany = new Obserwowany(this);
  }

  @Override
  public void kwacz() {
    System.out.println("Kaczka Gumowa robi: Pi! Pi!");
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