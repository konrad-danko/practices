package exercices.design_patterns.facade.zasada_ograniczonej_interakcji;

public class ZestawPogodowy {
  private StacjaMeteo stacjaMeteo;

  public float pobierzTemperature() {
    Termometr termometr = stacjaMeteo.pobierzTermometr();
    return termometr.pobierzTemperature();
  }

  public void doSth(){
    System.out.println(pobierzTemperature());
  }
}
