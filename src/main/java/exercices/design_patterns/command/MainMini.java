package exercices.design_patterns.command;

import exercices.design_patterns.command.pilot.MiniPilot;
import exercices.design_patterns.command.polecenie.PolecenieOtworzDrzwiGarazowe;
import exercices.design_patterns.command.polecenie.PolecenieWlaczSwiatlo;
import exercices.design_patterns.command.urzadzenia.DrzwiGarazowe;
import exercices.design_patterns.command.urzadzenia.Swiatlo;

public class MainMini {
  public static void main(String[] args) {

    MiniPilot miniPilot = new MiniPilot();

    Swiatlo swiatlo = new Swiatlo();
    PolecenieWlaczSwiatlo wlaczSwiatlo = new PolecenieWlaczSwiatlo(swiatlo);
    miniPilot.ustawPolecenie(wlaczSwiatlo);
    miniPilot.przyciskZostalNacisniety();

    DrzwiGarazowe drzwiGarazowe = new DrzwiGarazowe();
    PolecenieOtworzDrzwiGarazowe otworzDrzwiGarazowe = new PolecenieOtworzDrzwiGarazowe(drzwiGarazowe);
    miniPilot.ustawPolecenie(otworzDrzwiGarazowe);
    miniPilot.przyciskZostalNacisniety();
  }
}
