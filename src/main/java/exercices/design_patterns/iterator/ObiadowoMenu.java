package exercices.design_patterns.iterator;

import java.util.Iterator;

public class ObiadowoMenu implements Menu{
    private static final int MAX_LICZBA_ELEMENTOW = 6;
    int liczbaElementow = 0;
    PozycjaMenu[] pozycjeMenu;

    public ObiadowoMenu() {
        pozycjeMenu = new PozycjaMenu[MAX_LICZBA_ELEMENTOW];
        dodajElement("Wegetariańska kanapka BSP","(Wegetariański) boczek z sałatą i pomidorem, chleb pszenny pełnoziarnisty",true,12.99);
        dodajElement("Kanapka BSP","Boczek z sałatą i pomidorem, chleb pszenny pełnoziarnisty",false,12.99);
        dodajElement("Zupa dnia", "Zupa dnia i sałatka z pomidora", false, 15.19);
        dodajElement("Hot dog", "Hot dog z kiszoną kapustą, rzodkiewką cebulą i serem", false, 16.05);
    }

    public void dodajElement(String nazwa, String opis, boolean wegetarianska, double cena){
        PozycjaMenu pozycjaMenu = new PozycjaMenu(nazwa, opis, wegetarianska, cena);
        if (liczbaElementow >= MAX_LICZBA_ELEMENTOW) {
            System.err.println("Niestety, menu jest pełne! Nie można dodać nowej pozycji");
        } else {
            pozycjeMenu[liczbaElementow] = pozycjaMenu;
            liczbaElementow++;
        }
    }

    public Iterator<PozycjaMenu> utworzIterator(){
        return new ObiadowoMenuIterator(pozycjeMenu);
    }

    //inne metody
}
