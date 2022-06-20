package exercices.design_patterns.command;

import exercices.design_patterns.command.pilot.SuperPilotZWycofaniem;
import exercices.design_patterns.command.polecenie.PolecenieWlaczSwiatlo;
import exercices.design_patterns.command.polecenie.PolecenieWylaczSwiatlo;
import exercices.design_patterns.command.urzadzenia.Swiatlo;

public class MainZWycofaniem {

  public static void main(String[] args) {
    Swiatlo swiatlo = new Swiatlo();

    PolecenieWlaczSwiatlo polecenieWlaczSwiatlo =
        new PolecenieWlaczSwiatlo(swiatlo);
    PolecenieWylaczSwiatlo polecenieWylaczSwiatlo =
        new PolecenieWylaczSwiatlo(swiatlo);

    SuperPilotZWycofaniem pilot = new SuperPilotZWycofaniem();
    System.out.println(pilot);

    pilot.ustawPolecenie(0, polecenieWlaczSwiatlo, polecenieWylaczSwiatlo);
    System.out.println(pilot);

    pilot.wcisnietoPrzyciskWlacz(0);
    pilot.wcisnietoPrzyciskWylacz(0);
    System.out.println(pilot);
    pilot.wcisnietoPrzyciskWycofaj();

    pilot.wcisnietoPrzyciskWylacz(0);
    pilot.wcisnietoPrzyciskWlacz(0);
    System.out.println(pilot);
    pilot.wcisnietoPrzyciskWycofaj();

  }
}
