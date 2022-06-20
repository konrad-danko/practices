package exercices.design_patterns.command;

import exercices.design_patterns.command.pilot.SuperPilot;
import exercices.design_patterns.command.polecenie.*;
import exercices.design_patterns.command.urzadzenia.DrzwiGarazowe;
import exercices.design_patterns.command.urzadzenia.Swiatlo;
import exercices.design_patterns.command.urzadzenia.WiezaStereo;

public class MainSuper {
  public static void main(String[] args) {

    DrzwiGarazowe drzwi = new DrzwiGarazowe();
    Swiatlo swiatlo = new Swiatlo();
    WiezaStereo wieza = new WiezaStereo();

    PolecenieOtworzDrzwiGarazowe polecenieOtworzDrzwiGarazowe =
        new PolecenieOtworzDrzwiGarazowe(drzwi);
    PolecenieZamknijDrzwiGarazowe polecenieZamknijDrzwiGarazowe =
        new PolecenieZamknijDrzwiGarazowe(drzwi);

    PolecenieWlaczSwiatlo polecenieWlaczSwiatlo =
        new PolecenieWlaczSwiatlo(swiatlo);
    PolecenieWylaczSwiatlo polecenieWylaczSwiatlo =
        new PolecenieWylaczSwiatlo(swiatlo);

    PolecenieWiezaStereoWlaczCD polecenieWiezaStereoWlaczCD =
        new PolecenieWiezaStereoWlaczCD(wieza);
    PolecenieWiezaStereoWylacz polecenieWiezaStereoWylacz =
        new PolecenieWiezaStereoWylacz(wieza);

    SuperPilot pilot = new SuperPilot();
    System.out.println(pilot);

    pilot.ustawPolecenie(0, polecenieOtworzDrzwiGarazowe, polecenieZamknijDrzwiGarazowe);
    //jeśli metoda wykonaj() jest jedyną metoda interfejsu Polecenie to można użyć lambdy:
    //pilot.ustawPolecenie(0, ()-> drzwi.doGory(), ()-> drzwi.naDol());

    pilot.ustawPolecenie(1, polecenieWlaczSwiatlo, polecenieWylaczSwiatlo);
    //jeśli metoda wykonaj() jest jedyną metoda interfejsu Polecenie to można użyć 'method reference':
    //pilot.ustawPolecenie(1, swiatlo::wlacz, swiatlo::wylacz);

    pilot.ustawPolecenie(2, polecenieWiezaStereoWlaczCD, polecenieWiezaStereoWylacz);
    System.out.println(pilot);

    pilot.wcisnietoPrzyciskWlacz(0);
    pilot.wcisnietoPrzyciskWlacz(1);
    pilot.wcisnietoPrzyciskWlacz(2);
    pilot.wcisnietoPrzyciskWlacz(3);

    System.out.println("");
    pilot.wcisnietoPrzyciskWylacz(0);
    pilot.wcisnietoPrzyciskWylacz(1);
    pilot.wcisnietoPrzyciskWylacz(2);
    pilot.wcisnietoPrzyciskWylacz(3);
  }
}
