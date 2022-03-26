package exercices.bicycle_comp;

public class Bicycle {
  private String brand;
  private Integer frameSize;

  public Bicycle(String brand, Integer frameSize) {
    this.brand = brand;
    this.frameSize = frameSize;
  }

  public String getBrand() {
    return brand;
  }
  public void setBrand(String brand) {
    this.brand = brand;
  }

  public Integer getFrameSize() {
    return frameSize;
  }
  public void setFrameSize(Integer frameSize) {
    this.frameSize = frameSize;
  }

  @Override
  public String toString() {
    return "brand=" + brand +
        ", frameSize=" + frameSize;
  }

/*  @Override
  public int compareTo(Bicycle o) {
    return this.frameSize.compareTo(o.getFrameSize());
  }*/
}
