public abstract class Figura{
    protected String nombreFigura;
      
    //Metodo abstracto
    public abstract double calcularVolumen();
  
    public Figura(String n) {
      nombreFigura = n;
    }
  
    public String toString() {
  
      return "Volumen de " + nombreFigura + "\n" + calcularVolumen();
    } 
  
    
  }