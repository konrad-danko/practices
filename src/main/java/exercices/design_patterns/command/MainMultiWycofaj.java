package exercices.design_patterns.command;

import exercices.design_patterns.command.pilot.SuperPilotMultiWycofaj;
import exercices.design_patterns.command.polecenie.*;
import exercices.design_patterns.command.urzadzenia.DrzwiGarazowe;
import exercices.design_patterns.command.urzadzenia.Swiatlo;
import exercices.design_patterns.command.urzadzenia.WentylatorSufitowy;
import exercices.design_patterns.command.urzadzenia.WiezaStereo;

public class MainMultiWycofaj {
  public static void main(String[] args) {

    Swiatlo swiatlo = new Swiatlo();
    DrzwiGarazowe drzwi = new DrzwiGarazowe();
    WentylatorSufitowy wentylator = new WentylatorSufitowy("Jadalnia");
    WiezaStereo wieza = new WiezaStereo();

    PolecenieWlaczSwiatlo polecenieWlaczSwiatlo =
        new PolecenieWlaczSwiatlo(swiatlo);
    PolecenieWylaczSwiatlo polecenieWylaczSwiatlo =
        new PolecenieWylaczSwiatlo(swiatlo);

    PolecenieOtworzDrzwiGarazowe polecenieOtworzDrzwiGarazowe =
        new PolecenieOtworzDrzwiGarazowe(drzwi);
    PolecenieZamknijDrzwiGarazowe polecenieZamknijDrzwiGarazowe =
        new PolecenieZamknijDrzwiGarazowe(drzwi);

    PolecenieWentylatorSufitowyWolno polecenieWentylatorSufitowyWolno =
        new PolecenieWentylatorSufitowyWolno(wentylator);
    PolecenieWentylatorSufitowySrednio polecenieWentylatorSufitowySrednio =
        new PolecenieWentylatorSufitowySrednio(wentylator);
    PolecenieWentylatorSufitowySzybko polecenieWentylatorSufitowySzybko =
        new PolecenieWentylatorSufitowySzybko(wentylator);
    PolecenieWentylatorSufitowyWylacz polecenieWentylatorSufitowyWylacz =
        new PolecenieWentylatorSufitowyWylacz(wentylator);

    PolecenieWiezaStereoWlaczCD polecenieWiezaStereoWlaczCD =
        new PolecenieWiezaStereoWlaczCD(wieza);
    PolecenieWiezaStereoWylacz polecenieWiezaStereoWylacz =
        new PolecenieWiezaStereoWylacz(wieza);

    SuperPilotMultiWycofaj pilot = new SuperPilotMultiWycofaj();
    pilot.ustawPolecenie(0, polecenieWlaczSwiatlo, polecenieWylaczSwiatlo);
    pilot.ustawPolecenie(1, polecenieOtworzDrzwiGarazowe, polecenieZamknijDrzwiGarazowe);
    pilot.ustawPolecenie(2, polecenieWentylatorSufitowyWolno, polecenieWentylatorSufitowyWylacz);
    pilot.ustawPolecenie(3, polecenieWentylatorSufitowySrednio, polecenieWentylatorSufitowyWylacz);
    pilot.ustawPolecenie(4, polecenieWentylatorSufitowySzybko, polecenieWentylatorSufitowyWylacz);
    pilot.ustawPolecenie(5, polecenieWiezaStereoWlaczCD, polecenieWiezaStereoWylacz);
    System.out.println(pilot);

    System.out.println("\nWciskam przyciski pilota:");
    pilot.wcisnietoPrzyciskWycofaj();
    pilot.wcisnietoPrzyciskWycofaj();

    System.out.println("\nSwiatło");
    pilot.wcisnietoPrzyciskWlacz(0);
    pilot.wcisnietoPrzyciskWylacz(0);

    pilot.wcisnietoPrzyciskWycofaj();
    pilot.wcisnietoPrzyciskWycofaj();

    System.out.println("\nDrzwi garażowe");
    pilot.wcisnietoPrzyciskWlacz(1);
    pilot.wcisnietoPrzyciskWylacz(1);

    System.out.println("\nWentylator");
    pilot.wcisnietoPrzyciskWlacz(2);
    pilot.wcisnietoPrzyciskWlacz(3);
    pilot.wcisnietoPrzyciskWlacz(4);
    pilot.wcisnietoPrzyciskWylacz(4);

    System.out.println("\nWieża stereo");
    pilot.wcisnietoPrzyciskWlacz(5);
    pilot.wcisnietoPrzyciskWylacz(5);

    System.out.println("\nWciskam kilkukrotnie przycisk 'wycofaj':");
    pilot.wcisnietoPrzyciskWycofaj();
    pilot.wcisnietoPrzyciskWycofaj();
    pilot.wcisnietoPrzyciskWycofaj();
    pilot.wcisnietoPrzyciskWycofaj();
    pilot.wcisnietoPrzyciskWycofaj();
    pilot.wcisnietoPrzyciskWycofaj();
    pilot.wcisnietoPrzyciskWycofaj();
    pilot.wcisnietoPrzyciskWycofaj();
    pilot.wcisnietoPrzyciskWycofaj();
    pilot.wcisnietoPrzyciskWycofaj();
    pilot.wcisnietoPrzyciskWycofaj();
    pilot.wcisnietoPrzyciskWycofaj();
    pilot.wcisnietoPrzyciskWycofaj();
    pilot.wcisnietoPrzyciskWycofaj();
    pilot.wcisnietoPrzyciskWycofaj();






  }
}
