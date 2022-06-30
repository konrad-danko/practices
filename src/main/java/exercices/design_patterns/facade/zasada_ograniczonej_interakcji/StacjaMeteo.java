package exercices.design_patterns.facade.zasada_ograniczonej_interakcji;

public class StacjaMeteo {
  private Termometr termometr;

  public Termometr pobierzTermometr(){
    return this.termometr;
  }
}
