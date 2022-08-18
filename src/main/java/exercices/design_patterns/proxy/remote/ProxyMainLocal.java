package exercices.design_patterns.proxy.remote;

import java.rmi.Naming;

public class ProxyMainLocal {
  public static void main(String[] args) {

    String ipAddress = "rmi://127.0.0.1/";
    String serviceName = "automatSprzedajacy";

    try {
      AutomatSprzedajacyZdalny automat =
          (AutomatSprzedajacyZdalny) Naming.lookup(ipAddress + serviceName);
      AutomatSprzedajacyMonitor monitor = new AutomatSprzedajacyMonitor(automat);
      monitor.raport();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
