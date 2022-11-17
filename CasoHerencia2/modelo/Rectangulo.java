package modelo;

public class Rectangulo extends Figura
{
    //Atributos
    private double base;
    private double altura;

    //Constructor
    public Rectangulo()
    {
        super();
    }

    //Metodo
    public void CalcularAreaPerimetro(double base, double altura)
    {
        if(base != 0 && altura != 0)
        {
            Area = base * altura;
            Perimetro = 2 * (base + altura);
        }
        else
        {

        }
    }
}