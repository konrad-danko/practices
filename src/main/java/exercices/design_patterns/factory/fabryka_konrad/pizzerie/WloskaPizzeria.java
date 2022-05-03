package exercices.design_patterns.factory.fabryka_konrad.pizzerie;

import exercices.design_patterns.factory.fabryka_konrad.fabryka_skladnikow.WloskiZestawSkladnikowPizzy;
import exercices.design_patterns.factory.fabryka_konrad.pizze.OwoceMorzaPizza;
import exercices.design_patterns.factory.fabryka_konrad.pizze.Pizza;
import exercices.design_patterns.factory.fabryka_konrad.pizze.SerowaPizza;
import exercices.design_patterns.factory.fabryka_konrad.pizze.WegetarianskaPizza;

public class WloskaPizzeria extends Pizzeria{

  public WloskaPizzeria() {
    this.zestawSkladnikowPizzy = new WloskiZestawSkladnikowPizzy();
  }

  @Override
  protected Pizza utworzPizze(String type) {
    Pizza pizza = null;
    if ("serowa".equals(type)) {
      pizza = new SerowaPizza(zestawSkladnikowPizzy);
      pizza.ustawNazwa("Włoska pizza serowa");
    }
    if ("owoce morza".equals(type)) {
      pizza = new OwoceMorzaPizza(zestawSkladnikowPizzy);
      pizza.ustawNazwa("Włoska pizza owoce morza");
    }
    if ("wegetarianska".equals(type)) {
      pizza = new WegetarianskaPizza(zestawSkladnikowPizzy);
      pizza.ustawNazwa("Włoska pizza wegetariańska");
    }
    return pizza;
  }
}
