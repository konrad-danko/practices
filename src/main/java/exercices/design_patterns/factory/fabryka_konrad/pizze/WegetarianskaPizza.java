package exercices.design_patterns.factory.fabryka_konrad.pizze;

import exercices.design_patterns.factory.fabryka_konrad.fabryka_skladnikow.ZestawSkladnikowPizzy;

public class WegetarianskaPizza extends Pizza{
  public WegetarianskaPizza(ZestawSkladnikowPizzy zestawSkladnikowPizzy) {
    this.ciasto = zestawSkladnikowPizzy.getCiasto();
    this.sos = zestawSkladnikowPizzy.getSos();
    this.ser = zestawSkladnikowPizzy.getSer();
    this.warzywa = zestawSkladnikowPizzy.getWarzywa();
  }
}
