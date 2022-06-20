package exercices.design_patterns.command.polecenie;

import exercices.design_patterns.command.urzadzenia.DrzwiGarazowe;

public class PolecenieZamknijDrzwiGarazowe implements Polecenie{

  private DrzwiGarazowe drzwiGarazowe;

  public PolecenieZamknijDrzwiGarazowe(DrzwiGarazowe drzwiGarazowe) {
    this.drzwiGarazowe = drzwiGarazowe;
  }

  @Override
  public void wykonaj() {
    this.drzwiGarazowe.naDol();
  }

  @Override
  public void wycofaj() {
    this.drzwiGarazowe.doGory();
  }
}
