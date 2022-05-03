package exercices.design_patterns.factory.fabryka_konrad.fabryka_skladnikow;

import exercices.design_patterns.factory.fabryka_konrad.skladniki.ciasto.Ciasto;
import exercices.design_patterns.factory.fabryka_konrad.skladniki.malze.Malze;
import exercices.design_patterns.factory.fabryka_konrad.skladniki.pepperoni.Pepperoni;
import exercices.design_patterns.factory.fabryka_konrad.skladniki.ser.Ser;
import exercices.design_patterns.factory.fabryka_konrad.skladniki.sos.Sos;
import exercices.design_patterns.factory.fabryka_konrad.skladniki.warzywa.Warzywa;
import lombok.Getter;

@Getter
public abstract class ZestawSkladnikowPizzy {
  protected Ciasto ciasto;
  protected Sos sos;
  protected Ser ser;
  protected Warzywa[] warzywa;
  protected Pepperoni pepperoni;
  protected Malze malze;
}
