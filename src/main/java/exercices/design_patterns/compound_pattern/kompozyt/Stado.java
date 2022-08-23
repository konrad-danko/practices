package exercices.design_patterns.compound_pattern.kompozyt;

import exercices.design_patterns.compound_pattern.model_kaczki.Kwaczaca;
import exercices.design_patterns.compound_pattern.obserwator.Obserwator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stado implements Kwaczaca {
  private final List<Kwaczaca> ptaki = new ArrayList<>();

  public void dodaj(Kwaczaca ptak){
    ptaki.add(ptak);
  }

  @Override
  public void kwacz() {
    Iterator<Kwaczaca> iterator = ptaki.iterator();
    while(iterator.hasNext()) {
      Kwaczaca ptak = iterator.next();
      ptak.kwacz();
    }
  }

  @Override
  public void zarejestrujObserwator(Obserwator obserwator) {
    for (Kwaczaca ptak: ptaki) {
      ptak.zarejestrujObserwator(obserwator);
    }
  }

  @Override
  public void powiadomObserwatory() {}
}
