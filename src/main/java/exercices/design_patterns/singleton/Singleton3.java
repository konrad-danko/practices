package exercices.design_patterns.singleton;

//ten przykład gwarantuje unikalność przy programowaniu wielowątkowym
//synchronizacja jest ograniczona tylko do tworzenia nowego obiektu
//może być bezpiecznie stosowana od Java 5
public class Singleton3 {

  //to pole musi być statyczne i typu tejże klasy
  private volatile static Singleton3 unikalnaInstancja;
  //tu można umieścic inne zmienne obiektowe

  //konstruktor musi być prywatny
  private Singleton3() {}

  //poniższa metoda jest statycznym getterem atrybutu 'unikalnaInstancja'
  public static Singleton3 getUnikalnaInstancja(){
    if (unikalnaInstancja == null){
      synchronized (Singleton3.class){
        if (unikalnaInstancja == null) {
          unikalnaInstancja = new Singleton3();
        }
      }
    }
    return unikalnaInstancja;
  }
  //tu można umieścić inne metody
}
