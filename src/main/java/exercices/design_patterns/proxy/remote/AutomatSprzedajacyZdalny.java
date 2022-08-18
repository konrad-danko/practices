package exercices.design_patterns.proxy.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AutomatSprzedajacyZdalny extends Remote {
  int pobierzLiczbaGum() throws RemoteException;
  String pobierzLokalizacja() throws RemoteException;
  Stan pobierzStan() throws RemoteException;
}
