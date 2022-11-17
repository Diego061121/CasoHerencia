package modelo;

public class Circulo extends Figura
{
    //Atributos
    private double radio;

    //Constructor
    public Circulo()
    {
        super();
    }

    //Metodo
    public void CalcularAreaPerimetro(double radio)
    {
        Area = Math.PI * (radio * radio);
        Perimetro = 2 * Math.PI * radio;
    }
}
