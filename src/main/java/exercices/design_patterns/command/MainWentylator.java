package exercices.design_patterns.command;

import exercices.design_patterns.command.pilot.SuperPilotZWycofaniem;
import exercices.design_patterns.command.polecenie.PolecenieWentylatorSufitowySrednio;
import exercices.design_patterns.command.polecenie.PolecenieWentylatorSufitowySzybko;
import exercices.design_patterns.command.polecenie.PolecenieWentylatorSufitowyWolno;
import exercices.design_patterns.command.polecenie.PolecenieWentylatorSufitowyWylacz;
import exercices.design_patterns.command.urzadzenia.WentylatorSufitowy;

public class MainWentylator {

  public static void main(String[] args) {

    SuperPilotZWycofaniem pilot = new SuperPilotZWycofaniem();
    WentylatorSufitowy wentylator = new WentylatorSufitowy("Jadalnia");

    PolecenieWentylatorSufitowySzybko polecenieSzybko = new PolecenieWentylatorSufitowySzybko(wentylator);
    PolecenieWentylatorSufitowySrednio polecenieSrednio = new PolecenieWentylatorSufitowySrednio(wentylator);
    PolecenieWentylatorSufitowyWolno polecenieWolno = new PolecenieWentylatorSufitowyWolno(wentylator);
    PolecenieWentylatorSufitowyWylacz polecenieWylacz = new PolecenieWentylatorSufitowyWylacz(wentylator);

    pilot.ustawPolecenie(0, polecenieSzybko, polecenieWylacz);
    pilot.ustawPolecenie(1, polecenieSrednio, polecenieWylacz);
    pilot.ustawPolecenie(2, polecenieWolno, polecenieWylacz);

    pilot.wcisnietoPrzyciskWlacz(0);
    pilot.wcisnietoPrzyciskWlacz(1);
    pilot.wcisnietoPrzyciskWycofaj();

    pilot.wcisnietoPrzyciskWlacz(2);
    pilot.wcisnietoPrzyciskWycofaj();

    pilot.wcisnietoPrzyciskWylacz(2);
    pilot.wcisnietoPrzyciskWycofaj();


  }
}
