package exercices.design_patterns.command.pilot;

import exercices.design_patterns.command.polecenie.BrakPolecenia;
import exercices.design_patterns.command.polecenie.Polecenie;

import java.util.ArrayList;
import java.util.List;

public class SuperPilotMultiWycofaj {

  private Polecenie[] poleceniaWlacz;
  private Polecenie[] poleceniaWylacz;
  private List<Polecenie> listaPolecenWycofaj;

  public SuperPilotMultiWycofaj() {
    this.poleceniaWlacz = new Polecenie[7];
    this.poleceniaWylacz = new Polecenie[7];

    Polecenie brakPolecenia = new BrakPolecenia();
    for (int i=0; i<7; i++) {
      this.poleceniaWlacz[i] = brakPolecenia;
      this.poleceniaWylacz[i] = brakPolecenia;
    }
    this.listaPolecenWycofaj = new ArrayList<>();
  }

  public void ustawPolecenie(int gniazdo, Polecenie polecenieWlacz, Polecenie polecenieWylacz){
    this.poleceniaWlacz[gniazdo] = polecenieWlacz;
    this.poleceniaWylacz[gniazdo] = polecenieWylacz;
  }

  public void wcisnietoPrzyciskWlacz(int gniazdo){
    this.poleceniaWlacz[gniazdo].wykonaj();
    this.listaPolecenWycofaj.add(this.poleceniaWlacz[gniazdo]);
  }

  public void wcisnietoPrzyciskWylacz(int gniazdo){
    this.poleceniaWylacz[gniazdo].wykonaj();
    this.listaPolecenWycofaj.add(this.poleceniaWylacz[gniazdo]);
  }

  public void wcisnietoPrzyciskWycofaj(){
    Polecenie polecenieWycofaj = new BrakPolecenia();
    int rozmiarListy = this.listaPolecenWycofaj.size();
    if (rozmiarListy>0) {
      polecenieWycofaj = this.listaPolecenWycofaj.remove(rozmiarListy-1);
    }
    polecenieWycofaj.wycofaj();
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
          .append(this.poleceniaWlacz[i].getClass().getSimpleName())
          .append("  ")
          .append(this.poleceniaWylacz[i].getClass().getSimpleName())
          .append("\n");
    }
    return builder.toString();
  }
}
