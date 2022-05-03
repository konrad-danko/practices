package exercices.design_patterns.factory.fabryka_abstrakcyjna.pizzerie;

import exercices.design_patterns.factory.fabryka_abstrakcyjna.fabryka_skladnikow.FabrykaSkladnikowPizzy;
import exercices.design_patterns.factory.fabryka_abstrakcyjna.fabryka_skladnikow.WloskaFabrykaSkladnikowPizzy;
import exercices.design_patterns.factory.fabryka_abstrakcyjna.pizze.OwoceMorzaPizza;
import exercices.design_patterns.factory.fabryka_abstrakcyjna.pizze.Pizza;
import exercices.design_patterns.factory.fabryka_abstrakcyjna.pizze.SerowaPizza;

public class WloskaPizzeria extends Pizzeria{
  @Override
  public Pizza utworzPizze(String type) {

    Pizza pizza = null;
    FabrykaSkladnikowPizzy fabrykaSkladnikow =
        new WloskaFabrykaSkladnikowPizzy();

    if ("serowa".equals(type)) {
      pizza = new SerowaPizza(fabrykaSkladnikow);
      pizza.ustawNazwa("Włoska pizza serowa");
    } else if ("owoce morza".equals(type)) {
      pizza = new OwoceMorzaPizza(fabrykaSkladnikow);
      pizza.ustawNazwa("Włoska pizza z owoców morza");
    }
    return pizza;
  }
}
