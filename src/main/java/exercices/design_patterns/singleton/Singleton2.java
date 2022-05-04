package exercices.design_patterns.singleton;

//ten przykład gwarantuje unikalność przy programowaniu wielowątkowym
//ale tworzenie takiego obiektu z wyprzedzeniem
//może stanowić dodatkowe obciążenie dla aplikacji
public class Singleton2 {

  //to pole musi być statyczne i typu tejże klasy
  private static Singleton2 unikalnaInstancja = new Singleton2();
  //tu można umieścic inne zmienne obiektowe

  //konstruktor musi być prywatny
  private Singleton2() {}

  //poniższa metoda jest statycznym getterem gotowego atrybutu 'unikalnaInstancja'
  public static Singleton2 getUnikalnaInstancja(){
    return unikalnaInstancja;
  }
  //tu można umieścić inne metody
}
