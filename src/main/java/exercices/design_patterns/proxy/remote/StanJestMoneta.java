package exercices.design_patterns.proxy.remote;

import java.util.Random;

public class StanJestMoneta implements Stan {
  private static final long serialVersionUID = 2L;
  private final transient AutomatSprzedajacy automatSprzedajacy;

  public StanJestMoneta(AutomatSprzedajacy automatSprzedajacy) {
    this.automatSprzedajacy = automatSprzedajacy;
  }

  @Override
  public void wlozMonete() {
    System.out.println("Nie można włożyć więcej niż jednej monety");
  }

  @Override
  public void zwrocMonete() {
    System.out.println("Moneta zwrócona");
    automatSprzedajacy.ustawStan(automatSprzedajacy.pobierzStanNieMaMonety());
  }

  @Override
  public void przekrecGalke() {
    System.out.println("Obróciłeś gałkę");
    boolean jestWygrana = new Random().nextInt(10) == 0;
    if (jestWygrana && automatSprzedajacy.pobierzLiczbaGum() > 1) {
      automatSprzedajacy.ustawStan(automatSprzedajacy.pobierzStanWygrana());
    } else {
      automatSprzedajacy.ustawStan(automatSprzedajacy.pobierzStanGumaSprzedana());
    }
  }

  @Override
  public void wydaj() {
    System.out.println("Nie wydano gumy");
  }

  @Override
  public void napelnij() {}
}
