package exercices.design_patterns.factory.fabryka_abstrakcyjna.fabryka_skladnikow;

import exercices.design_patterns.factory.fabryka_abstrakcyjna.skladniki.ciasto.Ciasto;
import exercices.design_patterns.factory.fabryka_abstrakcyjna.skladniki.malze.Malze;
import exercices.design_patterns.factory.fabryka_abstrakcyjna.skladniki.pepperoni.Pepperoni;
import exercices.design_patterns.factory.fabryka_abstrakcyjna.skladniki.ser.Ser;
import exercices.design_patterns.factory.fabryka_abstrakcyjna.skladniki.sos.Sos;
import exercices.design_patterns.factory.fabryka_abstrakcyjna.skladniki.warzywa.Warzywa;

public interface FabrykaSkladnikowPizzy {

  Ciasto utworzCiasto();
  Sos utworzSos();
  Ser utworzSer();
  Warzywa[] utworzWarzywa();
  Pepperoni utworzPepperoni();
  Malze utworzMalze();
}
