package exercices.design_patterns.proxy.remote;

import java.rmi.RemoteException;

public class AutomatSprzedajacyMonitor {
  private final AutomatSprzedajacyZdalny automat;

  public AutomatSprzedajacyMonitor(AutomatSprzedajacyZdalny automat) {
    this.automat = automat;
  }

  public void raport() {
    try {
      System.out.println("Automat sprzedający: " + automat.pobierzLokalizacja());
      System.out.println("Towar: " + automat.pobierzLiczbaGum() + " szt.");
      System.out.println("Bieżacy stan urządzenia: " + automat.pobierzStan().getClass().getSimpleName());
    } catch (RemoteException remoteException) {
      remoteException.printStackTrace();
    }
  }
}
