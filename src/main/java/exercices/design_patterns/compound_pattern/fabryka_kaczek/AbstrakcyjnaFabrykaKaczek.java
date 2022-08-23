package exercices.design_patterns.compound_pattern.fabryka_kaczek;

import exercices.design_patterns.compound_pattern.model_kaczki.Kwaczaca;

public abstract class AbstrakcyjnaFabrykaKaczek {
  public abstract Kwaczaca utworzKrzyzowkaKaczka();
  public abstract Kwaczaca utworzPlaskonosKaczka();
  public abstract Kwaczaca utworzWabikKaczka();
  public abstract Kwaczaca utworzGumowaKaczka();
}
