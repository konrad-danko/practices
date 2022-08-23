package exercices.design_patterns.compound_pattern.fabryka_kaczek;

import exercices.design_patterns.compound_pattern.dekorator.KwakLicznik;
import exercices.design_patterns.compound_pattern.model_kaczki.*;

public class FabrykaKaczekZLicznikiem extends AbstrakcyjnaFabrykaKaczek {
  @Override
  public Kwaczaca utworzKrzyzowkaKaczka() {
    return new KwakLicznik(new KrzyzowkaKaczka());
  }

  @Override
  public Kwaczaca utworzPlaskonosKaczka() {
    return new KwakLicznik(new PlaskonosKaczka());
  }

  @Override
  public Kwaczaca utworzWabikKaczka() {
    return new KwakLicznik(new WabikKaczka());
  }

  @Override
  public Kwaczaca utworzGumowaKaczka() {
    return new KwakLicznik(new GumowaKaczka());
  }
}
