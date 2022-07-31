package exercices.design_patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuSkladnik{
  List<MenuSkladnik> menuSkladniki;
  String nazwa;
  String opis;

  public Menu(String nazwa, String opis) {
    this.nazwa = nazwa;
    this.opis = opis;
    this.menuSkladniki = new ArrayList<>();
  }

  @Override
  public void dodaj(MenuSkladnik menuSkladnik){
    this.menuSkladniki.add(menuSkladnik);
  }

  @Override
  public void usun(MenuSkladnik menuSkladnik){
    this.menuSkladniki.remove(menuSkladnik);
  }

  @Override
  public MenuSkladnik pobierzPotomek(int i){
    return this.menuSkladniki.get(i);
  }

  @Override
  public String pobierzNazwa() {
    return nazwa;
  }

  @Override
  public String pobierzOpis() {
    return opis;
  }

  @Override
  public void drukuj(){
    System.out.print("\n" + pobierzNazwa());
    System.out.println(", " + pobierzOpis());
    System.out.println("--------------");
    for(MenuSkladnik menuSkladnik: this.menuSkladniki){
      menuSkladnik.drukuj();
    }
  }


}
