package exercices.design_patterns.compound_pattern.dekorator;

import exercices.design_patterns.compound_pattern.model_kaczki.Kwaczaca;
import exercices.design_patterns.compound_pattern.obserwator.Obserwator;

public class KwakLicznik implements Kwaczaca {
  private final Kwaczaca kaczka;
  static int liczbaKwakniec;

  public KwakLicznik(Kwaczaca kaczka) {
    this.kaczka = kaczka;
  }

  @Override
  public void kwacz() {
    kaczka.kwacz();
    liczbaKwakniec++;
  }

  public static int pobierzLiczbaKwakniec(){
    return liczbaKwakniec;
  }

  @Override
  public void zarejestrujObserwator(Obserwator obserwator) {
    kaczka.zarejestrujObserwator(obserwator);
  }

  @Override
  public void powiadomObserwatory() {
  }
}
