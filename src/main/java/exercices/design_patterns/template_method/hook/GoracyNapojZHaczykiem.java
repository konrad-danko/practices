package exercices.design_patterns.template_method.hook;

public abstract class GoracyNapojZHaczykiem {

  protected final void recepturaParzenia(){
    gotowanieWody();
    zaparzanie();
    nalewanieDoFilizanki();
    //wywołanie tej metody uzależnione jest od 'haczyka'
    if (czyKlientZyczyDodatki()) {
      domieszanieDodatkow();
    }
  }

  protected abstract void zaparzanie();

  protected abstract void domieszanieDodatkow();

  protected void gotowanieWody(){
    System.out.println("Gotujemy wodę w czajniku");
  }

  protected void nalewanieDoFilizanki(){
    System.out.println("Nalewamy napój " + this.getClass().getSimpleName() + " do filiżanki");
  }

  //ta metoda to 'haczyk', w implementacji moze być przesłonieta, a może też zostać taka jak tu:
  protected boolean czyKlientZyczyDodatki(){
    return true;
  }
}