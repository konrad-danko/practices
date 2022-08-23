package exercices.design_patterns.compound_pattern.obserwator;

import exercices.design_patterns.compound_pattern.obserwowany.KwakObserwowany;

public class Kwakolog implements Obserwator {
  @Override
  public void aktualizuj(KwakObserwowany kaczka) {
    System.out.println("Kwakolog: " +
        kaczka.getClass().getSimpleName() +
        " właśnie zakwakała.\n");
  }
}
