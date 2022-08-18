package exercices.design_patterns.proxy.protection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class InvocationHandlerNieWlasciciel implements InvocationHandler {
  private final Osoba osoba;

  private InvocationHandlerNieWlasciciel(Osoba osoba) {
    this.osoba = osoba;
  }

  @Override
  public Object invoke(Object posrednik, Method metoda, Object[] argumenty)
      throws IllegalAccessException {
    try {
      if (metoda.getName().startsWith("pobierz")) {
        return metoda.invoke(osoba, argumenty);
      } else if (metoda.getName().equals("ustawRankingPasji")) {
        return metoda.invoke(osoba, argumenty);
      } else if (metoda.getName().startsWith("ustaw")) {
        throw new IllegalAccessException();
      }
    } catch (InvocationTargetException exception) {
      exception.printStackTrace();
    }
    return null;
  }

  public static Osoba pobierzPosrednikNieWlasciciela(Osoba osoba){
    return (Osoba) Proxy.newProxyInstance(
        osoba.getClass().getClassLoader(),
        osoba.getClass().getInterfaces(),
        new InvocationHandlerNieWlasciciel(osoba));
  }
}
