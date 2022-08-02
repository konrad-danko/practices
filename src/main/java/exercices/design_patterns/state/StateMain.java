package exercices.design_patterns.state;

public class StateMain {
  public static void main(String[] args) {
    AutomatSprzedajacy automatSprzedajacy = new AutomatSprzedajacy(14);
    automatSprzedajacy.wlozMonete();
    System.out.println(automatSprzedajacy);
    automatSprzedajacy.zwrocMonete();

    automatSprzedajacy.wlozMonete();
    automatSprzedajacy.przekrecGalke();
    System.out.println(automatSprzedajacy);

    automatSprzedajacy.wlozMonete();
    automatSprzedajacy.przekrecGalke();
    System.out.println(automatSprzedajacy);

    automatSprzedajacy.wlozMonete();
    automatSprzedajacy.przekrecGalke();
    System.out.println(automatSprzedajacy);

    automatSprzedajacy.wlozMonete();
    automatSprzedajacy.przekrecGalke();
    System.out.println(automatSprzedajacy);

    automatSprzedajacy.napelnij(2);
    System.out.println(automatSprzedajacy);
  }
}
