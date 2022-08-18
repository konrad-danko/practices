package exercices.design_patterns.proxy.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ZdalnySerwis02 extends UnicastRemoteObject implements Zdalny {
  private static final long serialVersionUID = 2L;

  public ZdalnySerwis02() throws RemoteException {}

  @Override
  public String powiedzHej(){
    return "Usługa ZdalnySerwis02 mówi: 'Hej'";
  }

  @Override
  public String helloWorld() throws RemoteException {
    return "Hello World from ZdalnySerwis02";
  }
}
