package exercices.design_patterns.observer.obserwator;

import exercices.design_patterns.observer.obserwowany.DanePogodowe;

public interface Obserwator {
  void aktualizacja(DanePogodowe dane);
}
