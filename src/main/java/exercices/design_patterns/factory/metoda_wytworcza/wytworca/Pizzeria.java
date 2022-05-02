package exercices.design_patterns.factory.metoda_wytworcza.wytworca;

import exercices.design_patterns.factory.metoda_wytworcza.produkt.Pizza;

public abstract class Pizzeria {

  public Pizza zamowPizze(String type){
    Pizza pizza = utworzPizze(type);
    pizza.przygotowanie();
    pizza.pieczenie();
    pizza.krojenie();
    pizza.pakowanie();
    return pizza;
  }

  protected abstract Pizza utworzPizze(String type);
}
