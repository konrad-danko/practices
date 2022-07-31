package exercices.design_patterns.composite;

public abstract class MenuSkladnik {

  public void dodaj(MenuSkladnik menuSkladnik){
    throw new UnsupportedOperationException();
  }

  public void usun(MenuSkladnik menuSkladnik){
    throw new UnsupportedOperationException();
  }

  public MenuSkladnik pobierzPotomek(int i){
    throw new UnsupportedOperationException();
  }

  public String pobierzNazwa(){
    throw new UnsupportedOperationException();
  }

  public String pobierzOpis(){
    throw new UnsupportedOperationException();
  }

  public double pobierzCena(){
    throw new UnsupportedOperationException();
  }

  public boolean czyJestWegetarianska(){
    throw new UnsupportedOperationException();
  }

  public void drukuj(){
    throw new UnsupportedOperationException();
  }
}
