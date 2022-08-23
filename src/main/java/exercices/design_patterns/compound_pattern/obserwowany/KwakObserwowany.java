package exercices.design_patterns.compound_pattern.obserwowany;

import exercices.design_patterns.compound_pattern.obserwator.Obserwator;

public interface KwakObserwowany {
  void zarejestrujObserwator(Obserwator obserwator);
  void powiadomObserwatory();
}
