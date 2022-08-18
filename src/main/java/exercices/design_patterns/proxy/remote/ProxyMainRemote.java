package exercices.design_patterns.proxy.remote;

import java.rmi.Naming;

public class ProxyMainRemote {
  public static void main(String[] args) {

    try {
      //tworzymy obiekt usługi, nadajemy mu nazwę i rejestrujemy w rejestrze RMI:
      AutomatSprzedajacyZdalny automatSprzedajacy =
          new AutomatSprzedajacy(52, "Sopot");
      Naming.rebind("automatSprzedajacy", automatSprzedajacy);

    } catch(Exception exception){
      exception.printStackTrace();
    }

  }
}
