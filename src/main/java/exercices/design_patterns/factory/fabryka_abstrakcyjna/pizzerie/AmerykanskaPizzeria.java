package exercices.design_patterns.factory.fabryka_abstrakcyjna.pizzerie;

import exercices.design_patterns.factory.fabryka_abstrakcyjna.fabryka_skladnikow.AmerykanskaFabrykaSkladnikowPizzy;
import exercices.design_patterns.factory.fabryka_abstrakcyjna.fabryka_skladnikow.FabrykaSkladnikowPizzy;
import exercices.design_patterns.factory.fabryka_abstrakcyjna.pizze.OwoceMorzaPizza;
import exercices.design_patterns.factory.fabryka_abstrakcyjna.pizze.Pizza;
import exercices.design_patterns.factory.fabryka_abstrakcyjna.pizze.SerowaPizza;

public class AmerykanskaPizzeria extends Pizzeria{
  @Override
  public Pizza utworzPizze(String type) {

    Pizza pizza = null;
    FabrykaSkladnikowPizzy fabrykaSkladnikow =
        new AmerykanskaFabrykaSkladnikowPizzy();

    if ("serowa".equals(type)) {
      pizza = new SerowaPizza(fabrykaSkladnikow);
      pizza.ustawNazwa("Amerykańska pizza serowa");
    } else if ("owoce morza".equals(type)) {
      pizza = new OwoceMorzaPizza(fabrykaSkladnikow);
      pizza.ustawNazwa("Amerykańska pizza z owoców morza");
    }
    return pizza;
  }
}
