package exercices.design_patterns.proxy.remote;

import java.io.Serializable;

public interface Stan extends Serializable {
  void wlozMonete();
  void zwrocMonete();
  void przekrecGalke();
  void wydaj();
  void napelnij();
}
