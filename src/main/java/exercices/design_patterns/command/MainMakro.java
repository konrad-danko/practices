package exercices.design_patterns.command;

import exercices.design_patterns.command.pilot.SuperPilotZWycofaniem;
import exercices.design_patterns.command.polecenie.*;
import exercices.design_patterns.command.urzadzenia.DrzwiGarazowe;
import exercices.design_patterns.command.urzadzenia.Swiatlo;
import exercices.design_patterns.command.urzadzenia.WiezaStereo;

public class MainMakro {
  public static void main(String[] args) {

    System.out.println("\n*****************\n");

    SuperPilotZWycofaniem pilot = new SuperPilotZWycofaniem();
    DrzwiGarazowe drzwiGarazowe = new DrzwiGarazowe();
    Swiatlo swiatlo = new Swiatlo();
    WiezaStereo wiezaStereo = new WiezaStereo();

    PolecenieOtworzDrzwiGarazowe polecenieOtworzDrzwiGarazowe =
        new PolecenieOtworzDrzwiGarazowe(drzwiGarazowe);
    PolecenieZamknijDrzwiGarazowe polecenieZamknijDrzwiGarazowe =
        new PolecenieZamknijDrzwiGarazowe(drzwiGarazowe);

    PolecenieWlaczSwiatlo polecenieWlaczSwiatlo =
        new PolecenieWlaczSwiatlo(swiatlo);
    PolecenieWylaczSwiatlo polecenieWylaczSwiatlo =
        new PolecenieWylaczSwiatlo(swiatlo);

    PolecenieWiezaStereoWlaczCD polecenieWiezaStereoWlaczCD =
        new PolecenieWiezaStereoWlaczCD(wiezaStereo);
    PolecenieWiezaStereoWylacz polecenieWiezaStereoWylacz =
        new PolecenieWiezaStereoWylacz(wiezaStereo);

    Polecenie[] wlaczDuzo = {polecenieOtworzDrzwiGarazowe,
        polecenieWlaczSwiatlo, polecenieWiezaStereoWlaczCD};
    Polecenie[] wylaczDuzo = {polecenieZamknijDrzwiGarazowe,
        polecenieWylaczSwiatlo, polecenieWiezaStereoWylacz};

    Polecenie makroWlaczDuzo = new MakroPolecenie(wlaczDuzo);
    Polecenie makroWylaczDuzo = new MakroPolecenie(wylaczDuzo);

    pilot.ustawPolecenie(3, makroWlaczDuzo, makroWylaczDuzo);
    pilot.wcisnietoPrzyciskWlacz(3);
    System.out.println("\nMinęło 5 minut");
    pilot.wcisnietoPrzyciskWylacz(3);
    System.out.println("\nMinęło 6 minut");
    pilot.wcisnietoPrzyciskWycofaj();


  }
}
