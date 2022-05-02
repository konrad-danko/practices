package exercices.design_patterns.factory.metoda_wytworcza.wytworca;

import exercices.design_patterns.factory.metoda_wytworcza.produkt.AmerykanskaSerowaPizza;
import exercices.design_patterns.factory.metoda_wytworcza.produkt.Pizza;

public class AmerykanskaPizzeria extends Pizzeria{
  @Override
  public Pizza utworzPizze(String type) {
    if ("serowa".equals(type)) {
      return new AmerykanskaSerowaPizza();
    }
/*    if ("pepperoni".equals(type)) {
      return new AmerykanskaPepperoniPizza();
    }
    if ("owocemorza".equals(type)) {
      return new AmerykanskaOwoceMorzaPizza();
    }
    if ("wegetarianska".equals(type)) {
      return new AmerykanskaWegetarianskaPizza();
    }
    return QQQQQQQQQ;*/
    return null;
  }
}
