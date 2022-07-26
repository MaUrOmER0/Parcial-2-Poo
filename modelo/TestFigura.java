import javax.swing.JOptionPane;

public class TestFigura {
    public static void main(String[] args) {

    double radio;
    double altura;
    double lado;
    int figura = Integer.parseInt(JOptionPane.showInputDialog("Volumen de figura :\n1.Cilindro \n2.Cono \n3.Cubo \n4.Esfera "));
    radio = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de radio"));
    altura = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de altura"));
    lado = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del lado"));

    //Creacion de un objeto Suma
    switch (figura) {
      case 1:

        Cilindro miCilindro = new Cilindro(radio, altura);
        miCilindro.calcularVolumen();
        JOptionPane.showMessageDialog(null,"El volumen es igual a " + miCilindro );
        break;

      case 2:

        Cono miCono = new Cono(radio, altura);
        miCono.calcularVolumen();
        JOptionPane.showMessageDialog(null, miCono);
        break;

      case 3:
      Cubo miCubo = new Cubo(lado);
      miCubo.calcularVolumen();
      JOptionPane.showMessageDialog(null,"El volumen es igual a " + miCubo );
      break;

      case 4:
        Esfera miEsfera = new Esfera(radio);
        miEsfera.calcularVolumen();
        JOptionPane.showMessageDialog(null, "El volumen es igual a " + miEsfera);
        break;

    }


    System.exit(0);
    }
}