package exercices.design_patterns.template_method.core;

public abstract class GoracyNapoj {

  protected final void recepturaParzenia(){
    gotowanieWody();
    zaparzanie();
    nalewanieDoFilizanki();
    domieszanieDodatkow();
  }

  protected abstract void zaparzanie();

  protected abstract void domieszanieDodatkow();

  protected void gotowanieWody(){
    System.out.println("Gotujemy wodę w czajniku");
  }

  protected void nalewanieDoFilizanki(){
    System.out.println("Nalewamy napój " + this.getClass().getSimpleName() + " do filiżanki");
  }
}
