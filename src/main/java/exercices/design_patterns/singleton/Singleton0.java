package exercices.design_patterns.singleton;

//ten przykład nie gwarantuje unikalności przy programowaniu wielowątkowym
public class Singleton0 {

  //to pole musi być statyczne i typu tejże klasy
  private static Singleton0 unikalnaInstancja;
  //tu można umieścic inne zmienne obiektowe

  //konstruktor musi być prywatny
  private Singleton0() {}

  //poniższa metoda jest statycznym getterem atrybutu 'unikalnaInstancja'
  public static Singleton0 getUnikalnaInstancja(){
    if (unikalnaInstancja == null){
      unikalnaInstancja = new Singleton0();
    }
    return unikalnaInstancja;
  }
  //tu można umieścić inne metody
}
