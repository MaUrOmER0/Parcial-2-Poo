public class Cubo extends Figura {
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    //Metodo contructor
    public Cubo(double l) {
        super("Cubo");
        lado = l;
    }

    @Override
    public double calcularVolumen() {
        return Math.pow(lado, 3);
      }

}