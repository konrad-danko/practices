package exercices.design_patterns.factory.fabryka_konrad.pizze;

import exercices.design_patterns.factory.fabryka_konrad.fabryka_skladnikow.ZestawSkladnikowPizzy;

public class OwoceMorzaPizza extends Pizza{
  public OwoceMorzaPizza(ZestawSkladnikowPizzy zestawSkladnikowPizzy) {
    this.ciasto = zestawSkladnikowPizzy.getCiasto();
    this.sos = zestawSkladnikowPizzy.getSos();
    this.ser = zestawSkladnikowPizzy.getSer();
    this.malze = zestawSkladnikowPizzy.getMalze();
  }
}
