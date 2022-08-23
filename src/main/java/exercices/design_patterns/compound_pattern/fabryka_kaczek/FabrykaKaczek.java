package exercices.design_patterns.compound_pattern.fabryka_kaczek;

import exercices.design_patterns.compound_pattern.model_kaczki.*;

public class FabrykaKaczek extends AbstrakcyjnaFabrykaKaczek {
  @Override
  public Kwaczaca utworzKrzyzowkaKaczka() {
    return new KrzyzowkaKaczka();
  }

  @Override
  public Kwaczaca utworzPlaskonosKaczka() {
    return new PlaskonosKaczka();
  }

  @Override
  public Kwaczaca utworzWabikKaczka() {
    return new WabikKaczka();
  }

  @Override
  public Kwaczaca utworzGumowaKaczka() {
    return new GumowaKaczka();
  }
}
