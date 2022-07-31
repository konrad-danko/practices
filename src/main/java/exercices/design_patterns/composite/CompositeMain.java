package exercices.design_patterns.composite;

public class CompositeMain {

  public static void main(String[] args) {

    MenuSkladnik nalesnikarniaMenu = new Menu("MENU NALEŚNIKARNI", "Śniadania");
    nalesnikarniaMenu.dodaj(new PozycjaMenu("Śniadanie naleśnikowe K&B", "Naleśniki z jajecznicą i tostem", true, 12.99));
    nalesnikarniaMenu.dodaj(new PozycjaMenu("Śniadanie naleśnikowe zwykłe", "Naleśniki z jajkiem sadzonym i kiełbasą", false, 12.99));
    nalesnikarniaMenu.dodaj(new PozycjaMenu("Naleśniki z jagodami", "Naleśniki ze świeżymi jagodami i syrop jagodowy", true, 15.69));
    nalesnikarniaMenu.dodaj(new PozycjaMenu("Wafle nadziewane", "Wafle z jagodami lub truskawkami", true, 14.55));

    MenuSkladnik obiadowoMenu = new Menu("MENU BARU OBIADOWO", "Lunche");
    obiadowoMenu.dodaj(new PozycjaMenu("Wegetariańska kanapka BSP","(Wegetariański) boczek z sałatą i pomidorem, chleb pszenny pełnoziarnisty",true,12.99));
    obiadowoMenu.dodaj(new PozycjaMenu("Kanapka BSP","Boczek z sałatą i pomidorem, chleb pszenny pełnoziarnisty",false,12.99));
    obiadowoMenu.dodaj(new PozycjaMenu("Zupa dnia", "Zupa dnia i sałatka z pomidora", false, 15.19));
    obiadowoMenu.dodaj(new PozycjaMenu("Hot dog", "Hot dog z kiszoną kapustą, rzodkiewką, cebulą i serem", false, 16.05));

    MenuSkladnik deseryMenu = new Menu("MENU DESERÓW", "Desery, oczywiście");
    deseryMenu.dodaj(new PozycjaMenu("Lody", "Pyszne lody malinowe", true, 7.85));
    deseryMenu.dodaj(new PozycjaMenu("Ciasto", "Smaczne ciasto drożdżowe", true, 12.96));
    deseryMenu.dodaj(new PozycjaMenu("Owoce", "Mix owocowy z polewą czekoladową", true, 15.74));

    MenuSkladnik obiadManiaMenu = new Menu("MENU RESTAURACJI OBIADMANIA", "Obiady");
    obiadManiaMenu.dodaj(new PozycjaMenu("Kanapka wegetariańska z frytkami", "Kanapka wegetariańska z sałatą i pomidorem, frytki", true, 11.59));
    obiadManiaMenu.dodaj(new PozycjaMenu("Zupa dnia", "Miseczka zupy dnia, sałatka", false, 14.89));
    obiadManiaMenu.dodaj(new PozycjaMenu("Burito", "Duże burito z łaciatą fasolą, sosem salsa i guacamole", true, 17.29));
    obiadManiaMenu.dodaj(deseryMenu);

    MenuSkladnik wszystkieMenu = new Menu("WSZYSTKIE MENU", "Połączone menu");
    wszystkieMenu.dodaj(nalesnikarniaMenu);
    wszystkieMenu.dodaj(obiadowoMenu);
    wszystkieMenu.dodaj(obiadManiaMenu);

    Kelnerka kelnerka = new Kelnerka(wszystkieMenu);
    kelnerka.drukujMenu();
  }
}
