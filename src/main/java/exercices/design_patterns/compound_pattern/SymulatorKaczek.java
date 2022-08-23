package exercices.design_patterns.compound_pattern;

import exercices.design_patterns.compound_pattern.adapter.Ges;
import exercices.design_patterns.compound_pattern.adapter.GesAdapter;
import exercices.design_patterns.compound_pattern.dekorator.KwakLicznik;
import exercices.design_patterns.compound_pattern.fabryka_kaczek.AbstrakcyjnaFabrykaKaczek;
import exercices.design_patterns.compound_pattern.fabryka_kaczek.FabrykaKaczekZLicznikiem;
import exercices.design_patterns.compound_pattern.kompozyt.Stado;
import exercices.design_patterns.compound_pattern.model_kaczki.Kwaczaca;
import exercices.design_patterns.compound_pattern.obserwator.Kwakolog;

public class SymulatorKaczek {

  public static void main(String[] args) {
    SymulatorKaczek symulator = new SymulatorKaczek();
    AbstrakcyjnaFabrykaKaczek fabrykaKaczek = new FabrykaKaczekZLicznikiem();
    symulator.uruchom(fabrykaKaczek);
  }

  private void uruchom(AbstrakcyjnaFabrykaKaczek fabrykaKaczek){
    Kwaczaca plaskonosKaczka = fabrykaKaczek.utworzPlaskonosKaczka();
    Kwaczaca wabikKaczka = fabrykaKaczek.utworzWabikKaczka();
    Kwaczaca gumowaKaczka = fabrykaKaczek.utworzGumowaKaczka();
    Kwaczaca gesKaczka = new GesAdapter(new Ges());

    //System.out.println("\nSymulator Kaczek: z wzorcem Kompozyt stada:");

    Stado stadoKaczek = new Stado();
    stadoKaczek.dodaj(plaskonosKaczka);
    stadoKaczek.dodaj(wabikKaczka);
    stadoKaczek.dodaj(gumowaKaczka);
    stadoKaczek.dodaj(gesKaczka);

    Stado stadoKaczekKrzyzowek = new Stado();
    Kwaczaca krzyzowka1 = fabrykaKaczek.utworzKrzyzowkaKaczka();
    Kwaczaca krzyzowka2 = fabrykaKaczek.utworzKrzyzowkaKaczka();
    Kwaczaca krzyzowka3 = fabrykaKaczek.utworzKrzyzowkaKaczka();
    Kwaczaca krzyzowka4 = fabrykaKaczek.utworzKrzyzowkaKaczka();
    stadoKaczekKrzyzowek.dodaj(krzyzowka1);
    stadoKaczekKrzyzowek.dodaj(krzyzowka2);
    stadoKaczekKrzyzowek.dodaj(krzyzowka3);
    stadoKaczekKrzyzowek.dodaj(krzyzowka4);

    stadoKaczek.dodaj(stadoKaczekKrzyzowek);

    System.out.println("\nStado kaczek: z wzorcem Obserwator\n");
    Kwakolog kwakolog = new Kwakolog();
    stadoKaczek.zarejestrujObserwator(kwakolog);

    uruchom(stadoKaczek);

    System.out.println("\nSymulator kaczek: Symulacja stadka kaczek Krzyżówek:");
    uruchom(stadoKaczekKrzyzowek);

    System.out.println("\nKaczki zakwakały w sumie: " +
        KwakLicznik.pobierzLiczbaKwakniec() +
        " razy.");
  }

  private void uruchom(Kwaczaca kaczka){
    kaczka.kwacz();
  }
}
