package exercices.design_patterns.facade;

import exercices.design_patterns.facade.fasady.FasadaKinaDomowego;
import exercices.design_patterns.facade.urzadzenia.*;

public class MainFacade {

  public static void main(String[] args) {
    Wzmacniacz wzmacniacz = new Wzmacniacz();
    Tuner tuner = new Tuner();
    OdtwarzaczMultimediow odtwarzacz = new OdtwarzaczMultimediow();
    Projektor projektor = new Projektor();
    OswietlenieKinowe oswietlenie = new OswietlenieKinowe();
    Ekran ekran = new Ekran();
    MaszynkaPopcorn popcorn = new MaszynkaPopcorn();

    FasadaKinaDomowego fasadaKinaDomowego = new FasadaKinaDomowego(wzmacniacz,
        tuner, odtwarzacz, projektor, oswietlenie, ekran, popcorn);

    fasadaKinaDomowego.odtwarzajFilm("Avatar");
    fasadaKinaDomowego.zakonczOdtwarzanieFilmu();
  }
}
