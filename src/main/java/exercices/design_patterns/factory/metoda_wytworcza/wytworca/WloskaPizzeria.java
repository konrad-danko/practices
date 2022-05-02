package exercices.design_patterns.factory.metoda_wytworcza.wytworca;

import exercices.design_patterns.factory.metoda_wytworcza.produkt.Pizza;
import exercices.design_patterns.factory.metoda_wytworcza.produkt.WloskaSerowaPizza;

public class WloskaPizzeria extends Pizzeria{
  @Override
  public Pizza utworzPizze(String type) {
    if ("serowa".equals(type)) {
      return new WloskaSerowaPizza();
    }
/*    if ("pepperoni".equals(type)) {
      return new WloskaPepperoniPizza();
    }
    if ("owocemorza".equals(type)) {
      return new WloskaOwoceMorzaPizza();
    }
    if ("wegetarianska".equals(type)) {
      return new WloskaWegetarianskaPizza();
    }
    return QQQQQQQQQ;*/
    return null;
  }
}
