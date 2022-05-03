package exercices.design_patterns.factory.fabryka_abstrakcyjna.pizzerie;

import exercices.design_patterns.factory.fabryka_abstrakcyjna.pizze.Pizza;

public abstract class Pizzeria {
  public Pizza zamowPizze(String type){
    Pizza pizza = utworzPizze(type);
    pizza.przygotowanie();
    pizza.pieczenie();
    pizza.krojenie();
    pizza.pakowanie();
    return pizza;
  }

  public abstract Pizza utworzPizze(String type);
}
