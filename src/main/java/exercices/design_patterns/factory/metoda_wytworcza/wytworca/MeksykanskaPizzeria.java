package exercices.design_patterns.factory.metoda_wytworcza.wytworca;

import exercices.design_patterns.factory.metoda_wytworcza.produkt.MeksykanskaSerowaPizza;
import exercices.design_patterns.factory.metoda_wytworcza.produkt.Pizza;

public class MeksykanskaPizzeria extends Pizzeria{
  @Override
  public Pizza utworzPizze(String type) {
    if ("serowa".equals(type)) {
      return new MeksykanskaSerowaPizza();
    }
/*    if ("pepperoni".equals(type)) {
      return new MeksykanskaPepperoniPizza();
    }
    if ("owocemorza".equals(type)) {
      return new MeksykanskaOwoceMorzaPizza();
    }
    if ("wegetarianska".equals(type)) {
      return new MeksykanskaWegetarianskaPizza();
    }
    return QQQQQQQQQ;*/
    return null;
  }
}
