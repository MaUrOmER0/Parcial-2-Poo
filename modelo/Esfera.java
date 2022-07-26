public class Esfera extends  Figura {

    private double radio;

public double getRadio() {
        return radio;
    }
 public void setRadio(double radio) {
        this.radio = radio;
    }

//Constructor
  public Esfera(double r)
  {
    super("Esfera");
    radio = r;
  
  }

  @Override
  public double calcularVolumen() {
    return 4/3 * Math.PI * Math.pow(radio, 2);
  }


}