public class Cono extends Figura {
    private double radio;
    private double altura;
   
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }


    //Metodo constructor
    public Cono(double r, double h) {
        super("Cono");
         radio = r;
         altura = h;
    }

    @Override
    public double calcularVolumen() {
        return 1/3 * Math.PI * Math.pow(radio, 3) * altura;
    }

}