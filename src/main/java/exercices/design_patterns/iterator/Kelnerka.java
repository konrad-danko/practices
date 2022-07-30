package exercices.design_patterns.iterator;

import java.util.Iterator;
import java.util.List;

public class Kelnerka {

    private final List<Menu> listaMenu;

    public Kelnerka(List<Menu> listaMenu) {
        this.listaMenu = listaMenu;
    }

    public void drukujMenu(){
        Iterator<Menu> menuIterator = this.listaMenu.iterator();
        while (menuIterator.hasNext()) {
            Menu menu = menuIterator.next();
            String nazwaMenu = menu.getClass().getSimpleName();
            System.out.println("\n" + nazwaMenu);
            drukujMenu(menu.utworzIterator());
        }
    }

    private void drukujMenu(Iterator<PozycjaMenu> iterator){
        while (iterator.hasNext()) {
            PozycjaMenu pozycjaMenu = iterator.next();
            System.out.print(pozycjaMenu.pobierzNazwa() + ", ");
            System.out.print(pozycjaMenu.pobierzCena() + " -- ");
            System.out.println(pozycjaMenu.pobierzOpis());
        }
    }
}
