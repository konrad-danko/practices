package exercices.design_patterns.factory.fabryka_konrad.fabryka_skladnikow;

import exercices.design_patterns.factory.fabryka_konrad.skladniki.ciasto.CienkieChrupkieCiasto;
import exercices.design_patterns.factory.fabryka_konrad.skladniki.malze.MalzeSwieze;
import exercices.design_patterns.factory.fabryka_konrad.skladniki.pepperoni.PepperoniWPlasterkach;
import exercices.design_patterns.factory.fabryka_konrad.skladniki.ser.SerRegiano;
import exercices.design_patterns.factory.fabryka_konrad.skladniki.sos.SosMarinara;
import exercices.design_patterns.factory.fabryka_konrad.skladniki.warzywa.*;

public class WloskiZestawSkladnikowPizzy extends ZestawSkladnikowPizzy{
  public WloskiZestawSkladnikowPizzy() {
    this.ciasto = new CienkieChrupkieCiasto();
    this.sos = new SosMarinara();
    this.ser = new SerRegiano();
    this.warzywa = new Warzywa[]{new Czosnek(), new Cebula(), new Pieczarki(), new Papryka()};
    this.pepperoni = new PepperoniWPlasterkach();
    this.malze = new MalzeSwieze();
  }
}
