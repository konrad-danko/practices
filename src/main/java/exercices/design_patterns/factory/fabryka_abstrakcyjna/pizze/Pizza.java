package exercices.design_patterns.factory.fabryka_abstrakcyjna.pizze;

import exercices.design_patterns.factory.fabryka_abstrakcyjna.skladniki.ciasto.Ciasto;
import exercices.design_patterns.factory.fabryka_abstrakcyjna.skladniki.malze.Malze;
import exercices.design_patterns.factory.fabryka_abstrakcyjna.skladniki.pepperoni.Pepperoni;
import exercices.design_patterns.factory.fabryka_abstrakcyjna.skladniki.ser.Ser;
import exercices.design_patterns.factory.fabryka_abstrakcyjna.skladniki.sos.Sos;
import exercices.design_patterns.factory.fabryka_abstrakcyjna.skladniki.warzywa.Warzywa;

import java.util.Arrays;

public abstract class Pizza {
  String nazwa;
  Ciasto ciasto;
  Sos sos;
  Warzywa[] warzywa;
  Ser ser;
  Pepperoni pepperoni;
  Malze malze;

  public abstract void przygotowanie();

  public void pieczenie(){
    System.out.println("Pieczenie: 25 minut w temperaturze 180 st.C");
  }

  public void krojenie(){
    System.out.println("Krojenie pizzy na 8 kawałków");
  }

  public void pakowanie(){
    System.out.println("Pakowanie pizzy do firmowego pudełka sieci 'Super Pizzeria'");
  }

  public void ustawNazwa(String nazwa){
    this.nazwa = nazwa;
  }

  public String pobierzNazwa(){
    return nazwa;
  }

  @Override
  public String toString() {
    return "Pizza{" +
        "nazwa='" + nazwa + '\'' +
        ", ciasto=" + ciasto +
        ", sos=" + sos +
        ", warzywa=" + Arrays.toString(warzywa) +
        ", ser=" + ser +
        ", pepperoni=" + pepperoni +
        ", malze=" + malze +
        '}';
  }
}
