package ejecutable;

import javax.swing.JOptionPane;

import modelo.Circulo;
import modelo.Rectangulo;

public class Test
{
    //Metodo principal
    public static void main(String[] args) 
    {
        double base = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la base: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la altura: "));
        double radio = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del radio: "));
        
        Rectangulo miRectangulo = new Rectangulo();
        miRectangulo.CalcularAreaPerimetro(base, altura);
        JOptionPane.showMessageDialog(null, "El area del rectangulo con base de " + base + " y altura de " + altura + " es " + miRectangulo.getArea());
        JOptionPane.showMessageDialog(null, "El perimetro del rectangulo con base de " + base + " y altura de " + altura + " es " + miRectangulo.getPerimetro());

        Circulo miCirculo = new Circulo();
        miCirculo.CalcularAreaPerimetro(radio);
        JOptionPane.showMessageDialog(null, "El area del circulo con radio de " + radio + " es " + miCirculo.getArea());
        JOptionPane.showMessageDialog(null, "El perimetro del circulo con radio de " + radio + " es " + miCirculo.getPerimetro());

        System.exit(0);
    }
}
