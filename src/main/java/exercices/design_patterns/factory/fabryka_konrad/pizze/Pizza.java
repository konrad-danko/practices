package exercices.design_patterns.factory.fabryka_konrad.pizze;

import exercices.design_patterns.factory.fabryka_konrad.skladniki.ciasto.Ciasto;
import exercices.design_patterns.factory.fabryka_konrad.skladniki.malze.Malze;
import exercices.design_patterns.factory.fabryka_konrad.skladniki.pepperoni.Pepperoni;
import exercices.design_patterns.factory.fabryka_konrad.skladniki.ser.Ser;
import exercices.design_patterns.factory.fabryka_konrad.skladniki.sos.Sos;
import exercices.design_patterns.factory.fabryka_konrad.skladniki.warzywa.Warzywa;

import java.util.Arrays;

public abstract class Pizza {
  protected String nazwa;
  protected Ciasto ciasto;
  protected Sos sos;
  protected Ser ser;
  protected Warzywa[] warzywa;
  protected Pepperoni pepperoni;
  protected Malze malze;

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
