package exercices.design_patterns.compound_pattern.obserwator;

import exercices.design_patterns.compound_pattern.obserwowany.KwakObserwowany;

public interface Obserwator {
  void aktualizuj(KwakObserwowany kaczka);
}
