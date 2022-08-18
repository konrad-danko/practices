package exercices.design_patterns.proxy.protection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class InvocationHandlerWlasciciel implements InvocationHandler {
  private final Osoba osoba;

  private InvocationHandlerWlasciciel(Osoba osoba) {
    this.osoba = osoba;
  }

  @Override
  public Object invoke(Object posrednik, Method metoda, Object[] argumenty)
      throws IllegalAccessException {
    try {
      if (metoda.getName().startsWith("pobierz")) {
        return metoda.invoke(osoba, argumenty);
      } else if (metoda.getName().equals("ustawRankingPasji")) {
        throw new IllegalAccessException();
      } else if (metoda.getName().startsWith("ustaw")) {
        return metoda.invoke(osoba, argumenty);
      }
    } catch (InvocationTargetException exception) {
      exception.printStackTrace();
    }
    return null;
  }

  public static Osoba pobierzPosrednikWlasciciela(Osoba osoba){
    return (Osoba) Proxy.newProxyInstance(
        osoba.getClass().getClassLoader(),
        osoba.getClass().getInterfaces(),
        new InvocationHandlerWlasciciel(osoba));
  }
}
