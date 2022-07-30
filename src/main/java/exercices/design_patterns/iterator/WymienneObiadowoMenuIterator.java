package exercices.design_patterns.iterator;

import java.util.Calendar;
import java.util.Iterator;

public class WymienneObiadowoMenuIterator implements Iterator<PozycjaMenu> {
  private final PozycjaMenu[] elementy;
  private int pozycja;

  public WymienneObiadowoMenuIterator(PozycjaMenu[] elementy) {
    this.elementy = elementy;
    this.pozycja = Calendar.DAY_OF_WEEK % 2;
  }

  @Override
  public boolean hasNext() {
    if (pozycja >= elementy.length || elementy[pozycja] == null) {
      return false;
    } else {
      return true;
    }
  }

  @Override
  public PozycjaMenu next() {
    PozycjaMenu pozycjaMenu = elementy[pozycja];
    pozycja = pozycja + 2;
    return pozycjaMenu;
  }

  @Override
  public void remove() {
    throw new UnsupportedOperationException(
        "WymienneObiadowoMenuIterator nie zapewnia obsługi operacji usuwania elementów");
  }
}
