package exercices.design_patterns.factory.fabryka_abstrakcyjna.fabryka_skladnikow;

import exercices.design_patterns.factory.fabryka_abstrakcyjna.skladniki.ciasto.Ciasto;
import exercices.design_patterns.factory.fabryka_abstrakcyjna.skladniki.ciasto.CienkieChrupkieCiasto;
import exercices.design_patterns.factory.fabryka_abstrakcyjna.skladniki.malze.Malze;
import exercices.design_patterns.factory.fabryka_abstrakcyjna.skladniki.malze.MalzeSwieze;
import exercices.design_patterns.factory.fabryka_abstrakcyjna.skladniki.pepperoni.Pepperoni;
import exercices.design_patterns.factory.fabryka_abstrakcyjna.skladniki.pepperoni.PepperoniWPlasterkach;
import exercices.design_patterns.factory.fabryka_abstrakcyjna.skladniki.ser.Ser;
import exercices.design_patterns.factory.fabryka_abstrakcyjna.skladniki.ser.SerRegiano;
import exercices.design_patterns.factory.fabryka_abstrakcyjna.skladniki.sos.Sos;
import exercices.design_patterns.factory.fabryka_abstrakcyjna.skladniki.sos.SosMarinara;
import exercices.design_patterns.factory.fabryka_abstrakcyjna.skladniki.warzywa.*;

public class WloskaFabrykaSkladnikowPizzy implements FabrykaSkladnikowPizzy{
  @Override
  public Ciasto utworzCiasto() {
    return new CienkieChrupkieCiasto();
  }

  @Override
  public Sos utworzSos() {
    return new SosMarinara();
  }

  @Override
  public Ser utworzSer() {
    return new SerRegiano();
  }

  @Override
  public Warzywa[] utworzWarzywa() {
    Warzywa[] warzywa = {new Czosnek(), new Cebula(), new Pieczarki(), new Papryka()};
    return warzywa;
  }

  @Override
  public Pepperoni utworzPepperoni() {
    return new PepperoniWPlasterkach();
  }

  @Override
  public Malze utworzMalze() {
    return new MalzeSwieze();
  }
}
