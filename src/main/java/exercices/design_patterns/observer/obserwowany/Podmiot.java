package exercices.design_patterns.observer.obserwowany;

import exercices.design_patterns.observer.obserwator.Obserwator;

public interface Podmiot {
  void zarejestrujObserwator(Obserwator obserwator);
  void usunObserwator(Obserwator obserwator);
  void powiadomObserwatory();
}
