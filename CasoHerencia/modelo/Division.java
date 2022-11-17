package modelo;

import javax.swing.JOptionPane;

public class Division extends Operacion
{
    //Constructor 
    public Division(double x, double y)
    {
        super(x, y);
    }

    //Metodos
    public void Dividir()
    {
        if(y != 0)
        {
            JOptionPane.showMessageDialog("La division entre 0 es indeterminada");
        }

        else
        {
            resultado = x / y;
        }

    }
}
