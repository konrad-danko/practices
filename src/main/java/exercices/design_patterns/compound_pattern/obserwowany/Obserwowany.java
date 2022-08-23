package exercices.design_patterns.compound_pattern.obserwowany;

import exercices.design_patterns.compound_pattern.obserwator.Obserwator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Obserwowany implements KwakObserwowany {
  private final List<Obserwator> obserwatory = new ArrayList<>();
  KwakObserwowany kaczka;

  public Obserwowany(KwakObserwowany kaczka) {
    this.kaczka = kaczka;
  }

  @Override
  public void zarejestrujObserwator(Obserwator obserwator) {
    obserwatory.add(obserwator);
  }

  @Override
  public void powiadomObserwatory() {
    Iterator<Obserwator> iterator = obserwatory.iterator();
    while (iterator.hasNext()) {
      Obserwator obserwator = iterator.next();
      obserwator.aktualizuj(kaczka);
    }
  }
}
