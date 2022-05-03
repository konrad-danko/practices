package exercices.design_patterns.factory.fabryka_abstrakcyjna.fabryka_skladnikow;

import exercices.design_patterns.factory.fabryka_abstrakcyjna.skladniki.ciasto.Ciasto;
import exercices.design_patterns.factory.fabryka_abstrakcyjna.skladniki.ciasto.GrubeChrupkieCiasto;
import exercices.design_patterns.factory.fabryka_abstrakcyjna.skladniki.malze.Malze;
import exercices.design_patterns.factory.fabryka_abstrakcyjna.skladniki.malze.MalzeMrozone;
import exercices.design_patterns.factory.fabryka_abstrakcyjna.skladniki.pepperoni.Pepperoni;
import exercices.design_patterns.factory.fabryka_abstrakcyjna.skladniki.pepperoni.PepperoniWPlasterkach;
import exercices.design_patterns.factory.fabryka_abstrakcyjna.skladniki.ser.Ser;
import exercices.design_patterns.factory.fabryka_abstrakcyjna.skladniki.ser.SerMozzarella;
import exercices.design_patterns.factory.fabryka_abstrakcyjna.skladniki.sos.Sos;
import exercices.design_patterns.factory.fabryka_abstrakcyjna.skladniki.sos.SosPomidorowy;
import exercices.design_patterns.factory.fabryka_abstrakcyjna.skladniki.warzywa.*;

public class AmerykanskaFabrykaSkladnikowPizzy implements FabrykaSkladnikowPizzy{
  @Override
  public Ciasto utworzCiasto() {
    return new GrubeChrupkieCiasto();
  }

  @Override
  public Sos utworzSos() {
    return new SosPomidorowy();
  }

  @Override
  public Ser utworzSer() {
    return new SerMozzarella();
  }

  @Override
  public Warzywa[] utworzWarzywa() {
    Warzywa[] warzywa = {new CzarneOliwki(), new Szpinak(), new Baklazan(), new Papryka()};
    return warzywa;
  }

  @Override
  public Pepperoni utworzPepperoni() {
    return new PepperoniWPlasterkach();
  }

  @Override
  public Malze utworzMalze() {
    return new MalzeMrozone();
  }
}
