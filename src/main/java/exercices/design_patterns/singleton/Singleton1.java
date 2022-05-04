package exercices.design_patterns.singleton;

//ten przykład gwarantuje unikalność przy programowaniu wielowątkowym
//ale synchronizacja bywa kosztowna dla wydajności aplikacji
public class Singleton1 {

  //to pole musi być statyczne i typu tejże klasy
  private static Singleton1 unikalnaInstancja;
  //tu można umieścic inne zmienne obiektowe

  //konstruktor musi być prywatny
  private Singleton1() {}

  //poniższa metoda jest statycznym getterem atrybutu 'unikalnaInstancja'
  public static synchronized Singleton1 getUnikalnaInstancja(){
    if (unikalnaInstancja == null){
      unikalnaInstancja = new Singleton1();
    }
    return unikalnaInstancja;
  }
  //tu można umieścić inne metody
}
