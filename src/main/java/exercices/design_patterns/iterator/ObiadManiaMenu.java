package exercices.design_patterns.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ObiadManiaMenu implements Menu{
  Map<String, PozycjaMenu> pozycjeMenu;

  public ObiadManiaMenu() {
    this.pozycjeMenu = new HashMap<>();
    dodajElement(
        "Kanapka wegetariańska z frytkami",
        "Kanapka wegetariańska z sałatą i pomidorem, frytki",
        true,
        11.59);
    dodajElement(
        "Zupa dnia",
        "Miseczka zupy dnia, sałatka",
        false,
        14.89);
    dodajElement(
        "Burito",
        "Duże burito z łaciatą fasolą, sosem salsa i guacamole",
        true,
        17.29);
  }

  private void dodajElement(String nazwa, String opis, boolean wegetarianska, double cena){
    PozycjaMenu pozycjaMenu = new PozycjaMenu(nazwa, opis, wegetarianska, cena);
    this.pozycjeMenu.put(nazwa, pozycjaMenu);
  }

  @Override
  public Iterator<PozycjaMenu> utworzIterator() {
    return this.pozycjeMenu.values().iterator();
  }
}
