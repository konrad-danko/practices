package exercices.design_patterns.proxy.remote;

public class StanBrakGum implements Stan {
  private static final long serialVersionUID = 2L;
  private final transient AutomatSprzedajacy automatSprzedajacy;

  public StanBrakGum(AutomatSprzedajacy automatSprzedajacy) {
    this.automatSprzedajacy = automatSprzedajacy;
  }

  @Override
  public void wlozMonete() {
    System.out.println("Nie możesz włożyć monety, gdy automat jest pusty");
  }

  @Override
  public void zwrocMonete() {
    System.out.println("Nie włożyłeś monety");
  }

  @Override
  public void przekrecGalke() {
    System.out.println("Przekręciłeś gałkę, ale automat jest pusty");
  }

  @Override
  public void wydaj() {
    System.out.println("Nie wydano gumy");
  }

  @Override
  public void napelnij() {
    automatSprzedajacy.ustawStan(automatSprzedajacy.pobierzStanNieMaMonety());
  }
}
