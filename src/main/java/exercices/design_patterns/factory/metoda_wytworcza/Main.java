package exercices.design_patterns.factory.metoda_wytworcza;

import exercices.design_patterns.factory.metoda_wytworcza.wytworca.AmerykanskaPizzeria;
import exercices.design_patterns.factory.metoda_wytworcza.wytworca.MeksykanskaPizzeria;
import exercices.design_patterns.factory.metoda_wytworcza.wytworca.Pizzeria;
import exercices.design_patterns.factory.metoda_wytworcza.wytworca.WloskaPizzeria;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    List<Pizzeria> pizzeriaList = new ArrayList<>();
    pizzeriaList.add(new WloskaPizzeria());
    pizzeriaList.add(new AmerykanskaPizzeria());
    pizzeriaList.add(new MeksykanskaPizzeria());

    pizzeriaList.forEach(p-> {
      p.zamowPizze("serowa");
      System.out.println("\n ***** \n");
    });
  }
}
