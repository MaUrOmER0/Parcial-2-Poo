public class Cilindro extends Figura {
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

    public Cilindro(double r,double h) {
        super("Cilindro");
        radio = r;
        altura = h;
    }

    @Override
    public double calcularVolumen() {
        return Math.PI * Math.pow(radio, 2) * altura;
    }



}