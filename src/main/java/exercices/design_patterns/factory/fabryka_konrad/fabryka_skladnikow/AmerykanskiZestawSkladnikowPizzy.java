package exercices.design_patterns.factory.fabryka_konrad.fabryka_skladnikow;

import exercices.design_patterns.factory.fabryka_konrad.skladniki.ciasto.GrubeChrupkieCiasto;
import exercices.design_patterns.factory.fabryka_konrad.skladniki.malze.MalzeMrozone;
import exercices.design_patterns.factory.fabryka_konrad.skladniki.pepperoni.PepperoniWPlasterkach;
import exercices.design_patterns.factory.fabryka_konrad.skladniki.ser.SerMozzarella;
import exercices.design_patterns.factory.fabryka_konrad.skladniki.sos.SosPomidorowy;
import exercices.design_patterns.factory.fabryka_konrad.skladniki.warzywa.*;

public class AmerykanskiZestawSkladnikowPizzy extends ZestawSkladnikowPizzy{
  public AmerykanskiZestawSkladnikowPizzy() {
    this.ciasto = new GrubeChrupkieCiasto();
    this.sos = new SosPomidorowy();
    this.ser = new SerMozzarella();
    this.warzywa = new Warzywa[]{new CzarneOliwki(), new Szpinak(), new Baklazan(), new Papryka()};
    this.pepperoni = new PepperoniWPlasterkach();
    this.malze = new MalzeMrozone();
  }
}
