package exercices.design_patterns.factory.prosta_fabryka;

import exercices.design_patterns.factory.prosta_fabryka.pizze.*;

public class ProstaFabrykaPizzy {

  public Pizza utworzPizze(String rodzaj){
    Pizza pizza = null;

    if("serowa".equals(rodzaj)){
      pizza = new SerowaPizza();
    }
    if("pepperoni".equals(rodzaj)){
      pizza = new PepperoniPizza();
    }
    if("owocemorza".equals(rodzaj)){
      pizza = new OwoceMorzaPizza();
    }
    if("wegetarianska".equals(rodzaj)){
      pizza = new WegetarianskaPizza();
    }
    return pizza;
  }
}
