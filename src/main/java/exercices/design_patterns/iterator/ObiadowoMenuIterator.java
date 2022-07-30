package exercices.design_patterns.iterator;

import java.util.Iterator;

public class ObiadowoMenuIterator implements Iterator<PozycjaMenu>{

    private final PozycjaMenu[] elementy;
    private int pozycja = 0;

    public ObiadowoMenuIterator(PozycjaMenu[] elementy) {
        this.elementy = elementy;
    }

    @Override
    public PozycjaMenu next() {
        PozycjaMenu pozycjaMenu = elementy[pozycja];
        pozycja++;
        return pozycjaMenu;
    }

    @Override
    public boolean hasNext() {
        if (pozycja >= elementy.length || elementy[pozycja] == null) {
            return false;
        } else {
            return true;
        }
    }
}
