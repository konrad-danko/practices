package exercices.design_patterns.facade.fasady;

import exercices.design_patterns.facade.urzadzenia.*;

public class FasadaKinaDomowego {
  private Wzmacniacz wzmacniacz;
  private Tuner tuner;
  private OdtwarzaczMultimediow odtwarzacz;
  private Projektor projektor;
  private OswietlenieKinowe oswietlenie;
  private Ekran ekran;
  private MaszynkaPopcorn popcorn;

  public FasadaKinaDomowego(Wzmacniacz wzmacniacz,
                            Tuner tuner,
                            OdtwarzaczMultimediow odtwarzacz,
                            Projektor projektor,
                            OswietlenieKinowe oswietlenie,
                            Ekran ekran,
                            MaszynkaPopcorn popcorn) {
    this.wzmacniacz = wzmacniacz;
    this.tuner = tuner;
    this.odtwarzacz = odtwarzacz;
    this.projektor = projektor;
    this.oswietlenie = oswietlenie;
    this.ekran = ekran;
    this.popcorn = popcorn;
  }

  public void odtwarzajFilm (String film){
    System.out.println("\nPrzygotuj się na seans filmowy. Obejrzymy sobie " + film);
    this.popcorn.wlacz();
    this.popcorn.przygotujPopcorn();
    this.oswietlenie.sciemniaj(10);
    this.ekran.wDol();
    this.projektor.wlacz();
    this.projektor.trybSzerokoekranowy();
    this.wzmacniacz.wlacz();
    this.wzmacniacz.ustawOdtwarzacz(this.odtwarzacz);
    this.wzmacniacz.ustawDzwiekPrzestrzenny();
    this.wzmacniacz.ustawGlosnosc(5);
    this.odtwarzacz.wlacz();
    this.odtwarzacz.odtwarzajFilm(film);
  }

  public void zakonczOdtwarzanieFilmu(){
    System.out.println("\nKoniec seansu, wyłączam kino domowe");
    this.popcorn.wylacz();
    this.oswietlenie.wlacz();
    this.ekran.wGore();
    this.projektor.wylacz();
    this.wzmacniacz.wylacz();
    this.odtwarzacz.zatrzymaj();
    this.odtwarzacz.wylacz();
  }
}
