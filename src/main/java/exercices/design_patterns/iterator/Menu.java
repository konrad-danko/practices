package exercices.design_patterns.iterator;

import java.util.Iterator;

public interface Menu {
  Iterator<PozycjaMenu> utworzIterator();
}
