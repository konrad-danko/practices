package exercices.design_patterns.factory.fabryka_konrad.pizzerie;

import exercices.design_patterns.factory.fabryka_konrad.fabryka_skladnikow.AmerykanskiZestawSkladnikowPizzy;
import exercices.design_patterns.factory.fabryka_konrad.pizze.OwoceMorzaPizza;
import exercices.design_patterns.factory.fabryka_konrad.pizze.Pizza;
import exercices.design_patterns.factory.fabryka_konrad.pizze.SerowaPizza;
import exercices.design_patterns.factory.fabryka_konrad.pizze.WegetarianskaPizza;

public class AmerykanskaPizzeria extends Pizzeria{

  public AmerykanskaPizzeria() {
    this.zestawSkladnikowPizzy = new AmerykanskiZestawSkladnikowPizzy();
  }

  @Override
  protected Pizza utworzPizze(String type) {
    Pizza pizza = null;
    if ("serowa".equals(type)) {
      pizza = new SerowaPizza(zestawSkladnikowPizzy);
      pizza.ustawNazwa("Amerykańska pizza serowa");
    }
    if ("owoce morza".equals(type)) {
      pizza = new OwoceMorzaPizza(zestawSkladnikowPizzy);
      pizza.ustawNazwa("Amerykańska pizza owoce morza");
    }
    if ("wegetarianska".equals(type)) {
      pizza = new WegetarianskaPizza(zestawSkladnikowPizzy);
      pizza.ustawNazwa("Amerykańska pizza wegetariańska");
    }
    return pizza;
  }
}
