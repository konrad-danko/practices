package exercices.design_patterns.proxy.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Zdalny extends Remote {
  String powiedzHej() throws RemoteException;
  String helloWorld() throws RemoteException;
}
