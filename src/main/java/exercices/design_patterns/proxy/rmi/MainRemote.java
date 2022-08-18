package exercices.design_patterns.proxy.rmi;

import java.rmi.Naming;

public class MainRemote {

  //Przed uruchomienien metody main() należy odpalić w konsoli
  //z katalogu 'target/classes' polecenie: rmiregistry
  public static void main(String[] args) {
    try {
      //tworzymy obiekt usługi, nadajemy mu nazwę i rejestrujemy w rejestrze RMI:
      Zdalny zdalnySerwis01 = new ZdalnySerwis01();
      Naming.rebind("ZdalnySerwis01", zdalnySerwis01);

      Zdalny zdalnySerwis02 = new ZdalnySerwis02();
      Naming.rebind("ZdalnySerwis02", zdalnySerwis02);

    } catch(Exception exception){
      exception.printStackTrace();
    }
  }
}
