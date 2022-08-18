package exercices.design_patterns.proxy.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ZdalnySerwis01 extends UnicastRemoteObject implements Zdalny {
  private static final long serialVersionUID = 1L;

  public ZdalnySerwis01() throws RemoteException {}

  @Override
  public String powiedzHej(){
    return "Usługa ZdalnySerwis01 mówi: 'Hej'";
  }

  @Override
  public String helloWorld() throws RemoteException {
    return "Hello World from ZdalnySerwis01";
  }
}