package exercices.design_patterns.state;

public class StanNieMaMonety implements Stan{
  private final AutomatSprzedajacy automatSprzedajacy;

  public StanNieMaMonety(AutomatSprzedajacy automatSprzedajacy) {
    this.automatSprzedajacy = automatSprzedajacy;
  }

  @Override
  public void wlozMonete() {
    System.out.println("Moneta przyjęta");
    automatSprzedajacy.ustawStan(automatSprzedajacy.pobierzStanJestMoneta());
  }

  @Override
  public void zwrocMonete() {
    System.out.println("Nie włożyłeś monety");
  }

  @Override
  public void przekrecGalke() {
    System.out.println("Zanim przekręcisz gałkę, wrzuć monetę");
  }

  @Override
  public void wydaj() {
    System.out.println("Najpierw zapłać");
  }

  @Override
  public void napelnij() {}
}
