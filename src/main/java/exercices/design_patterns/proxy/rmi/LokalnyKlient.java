package exercices.design_patterns.proxy.rmi;

import java.rmi.Naming;

public class LokalnyKlient {

  public static void main(String[] args) {
    try {
      Zdalny usluga01 = (Zdalny) Naming.lookup("rmi://127.0.0.1/ZdalnySerwis01");
      System.out.println(usluga01.powiedzHej());
      System.out.println(usluga01.helloWorld());

      Zdalny usluga02 = (Zdalny) Naming.lookup("rmi://127.0.0.1/ZdalnySerwis02");
      System.out.println(usluga02.powiedzHej());
      System.out.println(usluga02.helloWorld());
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
