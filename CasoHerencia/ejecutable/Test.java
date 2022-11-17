package ejecutable;

import javax.swing.JOptionPane;

import modelo.Division;
import modelo.Multiplicacion;
import modelo.Resta;
import modelo.Suma;

public class Test
{
    //Metodo principal
    public static void main(String[] args) 
    {
        //Entrada de datos 
        double x = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de x: "));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de y: "));

        //Creacion de un objeto Suma
        Suma miSuma = new Suma(x, y);
        miSuma.Sumar();
        JOptionPane.showMessageDialog(null, "La suma de " + x + " y " + y + " es " + miSuma.mostrarResultado());

        Resta miResta = new Resta(x, y);
        miResta.Restar();
        JOptionPane.showMessageDialog(null, "La resta de " + x + " y " + y + " es " + miResta.mostrarResultado());

        Multiplicacion miMultiplicacion = new Multiplicacion(x, y);
        miMultiplicacion.Multiplicar();
        JOptionPane.showMessageDialog(null, "La multiplicacion de " + x + " y " + y + " es " + miMultiplicacion.mostrarResultado());

        Division miDivision = new Division(x, y);
        miDivision.Dividir();
        JOptionPane.showMessageDialog(null, "La division de " + x + " y " + y + " es " + miDivision.mostrarResultado());

        System.exit(0);
    }
}
