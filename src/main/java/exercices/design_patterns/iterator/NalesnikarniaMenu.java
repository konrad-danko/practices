package exercices.design_patterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class NalesnikarniaMenu implements Menu{
    private final ArrayList<PozycjaMenu> pozycjeMenu;

    public NalesnikarniaMenu(){
        this.pozycjeMenu = new ArrayList<>();
        dodajElement("Śniadanie naleśnikowe K&B", "Naleśniki z jajecznicą i tostem", true, 12.99);
        dodajElement("Śniadanie naleśnikowe zwykłe", "Naleśniki z jajkiem sadzonym i kiełbasą", false, 12.99);
        dodajElement("Naleśniki z jagodami", "Naleśniki ze świeżymi jagodami i syrop jagodowy", true, 15.69);
        dodajElement("Wafle nadziewane", "Wafle z jagodami lub truskawkami", true, 14.55);
    }

    public void dodajElement(String nazwa, String opis, boolean wegetarianska, double cena){
        PozycjaMenu pozycjaMenu = new PozycjaMenu(nazwa, opis, wegetarianska, cena);
        pozycjeMenu.add(pozycjaMenu);
    }

    public Iterator<PozycjaMenu> utworzIterator(){
        return pozycjeMenu.iterator();
    }

    //inne metody związane z menu
}
