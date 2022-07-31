package exercices.design_patterns.composite;

public class PozycjaMenu extends MenuSkladnik{

  String nazwa;
  String opis;
  boolean wegetarianska;
  double cena;

  public PozycjaMenu(String nazwa, String opis, boolean wegetarianska, double cena) {
    this.nazwa = nazwa;
    this.opis = opis;
    this.wegetarianska = wegetarianska;
    this.cena = cena;
  }

  @Override
  public String pobierzNazwa() {
    return nazwa;
  }

  @Override
  public String pobierzOpis() {
    return opis;
  }

  @Override
  public double pobierzCena() {
    return cena;
  }

  @Override
  public boolean czyJestWegetarianska() {
    return wegetarianska;
  }

  @Override
  public void drukuj(){
    System.out.print(" " + pobierzNazwa());
    if (czyJestWegetarianska()) {
      System.out.print("(v)");
    }
    System.out.println(", " + pobierzCena());
    System.out.println("     -- " + pobierzOpis());
  }
}
