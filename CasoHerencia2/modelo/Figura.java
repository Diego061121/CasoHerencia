package modelo;

public class Figura 
{
    //Atributos 
    protected double Area;
    protected double Perimetro;
    protected double radio;

    //Constructor
    public Figura()
    {
        this.Area = 0;
        this.Perimetro = 0;
    }

    //Metodo
    public double getArea()
    {
        return this.Area;
    }

    public double getPerimetro()
    {
        return this.Perimetro;
    }
}
