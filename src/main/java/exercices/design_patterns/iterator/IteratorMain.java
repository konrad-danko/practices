package exercices.design_patterns.iterator;

import java.util.List;

public class IteratorMain {
    public static void main(String[] args) {
        Menu nalesnikarniaMenu = new NalesnikarniaMenu();
        Menu obiadowoMenu = new ObiadowoMenu();
        Menu obiadManiaMenu = new ObiadManiaMenu();

        List<Menu> menuList = List.of(nalesnikarniaMenu, obiadowoMenu, obiadManiaMenu);
        Kelnerka kelnerka = new Kelnerka(menuList);
        kelnerka.drukujMenu();
    }
}
