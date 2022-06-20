package exercices.design_patterns.command.polecenie;

import exercices.design_patterns.command.urzadzenia.DrzwiGarazowe;

public class PolecenieOtworzDrzwiGarazowe implements Polecenie{

  private DrzwiGarazowe drzwiGarazowe;

  public PolecenieOtworzDrzwiGarazowe(DrzwiGarazowe drzwiGarazowe) {
    this.drzwiGarazowe = drzwiGarazowe;
  }

  @Override
  public void wykonaj() {
    this.drzwiGarazowe.doGory();
  }

  @Override
  public void wycofaj() {
    this.drzwiGarazowe.naDol();
  }
}
