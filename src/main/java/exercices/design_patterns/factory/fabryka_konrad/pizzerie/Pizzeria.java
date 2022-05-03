package exercices.design_patterns.factory.fabryka_konrad.pizzerie;

import exercices.design_patterns.factory.fabryka_konrad.fabryka_skladnikow.ZestawSkladnikowPizzy;
import exercices.design_patterns.factory.fabryka_konrad.pizze.Pizza;

public abstract class Pizzeria {
  protected ZestawSkladnikowPizzy zestawSkladnikowPizzy;

  public void zamowPizze(String type){
    Pizza pizza = utworzPizze(type);
    pizza.pieczenie();
    pizza.krojenie();
    pizza.pakowanie();
    System.out.println(pizza);
  }

  protected abstract Pizza utworzPizze(String type);
}
