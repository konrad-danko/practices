package exercices.design_patterns.iterator;

public class PozycjaMenu {
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

    public String pobierzNazwa() {
        return nazwa;
    }

    public String pobierzOpis() {
        return opis;
    }

    public double pobierzCena() {
        return cena;
    }

    public boolean czyJestWegetarianska() {
        return wegetarianska;
    }
}
