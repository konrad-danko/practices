package exercices.design_patterns.command.pilot;

import exercices.design_patterns.command.polecenie.BrakPolecenia;
import exercices.design_patterns.command.polecenie.Polecenie;

public class SuperPilot {
  private Polecenie[] poleceniaWlacz;
  private Polecenie[] poleceniaWylacz;

  public SuperPilot() {
    this.poleceniaWlacz = new Polecenie[7];
    this.poleceniaWylacz = new Polecenie[7];

    Polecenie brakPolecenia = new BrakPolecenia();
    for (int i=0; i<7; i++) {
      this.poleceniaWlacz[i] = brakPolecenia;
      this.poleceniaWylacz[i] = brakPolecenia;
    }
  }

  public void ustawPolecenie(int gniazdo, Polecenie polecenieWlacz, Polecenie polecenieWylacz){
    this.poleceniaWlacz[gniazdo] = polecenieWlacz;
    this.poleceniaWylacz[gniazdo] = polecenieWylacz;
  }

  public void wcisnietoPrzyciskWlacz(int gniazdo){
    this.poleceniaWlacz[gniazdo].wykonaj();
  }

  public void wcisnietoPrzyciskWylacz(int gniazdo){
    this.poleceniaWylacz[gniazdo].wykonaj();
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("\n---- SuperPilot ----\n");
    for (int i=0; i<this.poleceniaWlacz.length; i++){
      builder
          .append("[gniazdo ")
          .append(i)
          .append("] ")
          .append(poleceniaWlacz[i].getClass().getSimpleName())
          .append("  ")
          .append(poleceniaWylacz[i].getClass().getSimpleName())
          .append("\n");
    }
    return builder.toString();
  }
}
