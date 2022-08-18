package exercices.design_patterns.proxy.remote;

public class StanWygrana implements Stan {
  private static final long serialVersionUID = 2L;
  private final transient AutomatSprzedajacy automatSprzedajacy;

  public StanWygrana(AutomatSprzedajacy automatSprzedajacy) {
    this.automatSprzedajacy = automatSprzedajacy;
  }

  @Override
  public void wlozMonete() {
    System.out.println("Proszę czekać na gumę");
  }

  @Override
  public void zwrocMonete() {
    System.out.println("Niestety, nie można zwrócić monety po przekręceniu gałki");
  }

  @Override
  public void przekrecGalke() {
    System.out.println("Nie dostaniesz gumy tylko dlatego, że przekręciłeś drugi raz!");
  }

  @Override
  public void wydaj() {
    automatSprzedajacy.zwolnijGume();
    if (automatSprzedajacy.pobierzLiczbaGum() == 0) {
      automatSprzedajacy.ustawStan(automatSprzedajacy.pobierzStanBrakGum());
    } else {
      automatSprzedajacy.zwolnijGume();
      System.out.println("Gratulujemy wygranej!");
      if (automatSprzedajacy.pobierzLiczbaGum() > 0) {
        automatSprzedajacy.ustawStan(automatSprzedajacy.pobierzStanNieMaMonety());
      } else {
        System.out.println("Ups, koniec gum!");
        automatSprzedajacy.ustawStan(automatSprzedajacy.pobierzStanBrakGum());
      }
    }
  }

  @Override
  public void napelnij() {}
}
