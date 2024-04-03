

public class Triangulo
{
    private double lado1, lado2, lado3;

    public Triangulo(double lado1, double lado2, double lado3)
    {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double CalcularArea()
    {
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    public double CalcularPerimetro()
    {
        return lado1 + lado2 + lado3;
    }

    public double CalcularHipotenusa()
    {
        if (lado1 > lado2 && lado1 > lado3)
        {
            return Math.sqrt(lado1 * lado1 - lado2 * lado2 + lado3 * lado3);
        }
        else if (lado2 > lado1 && lado2 > lado3)
        {
            return Math.sqrt(lado2 * lado2 - lado1 * lado1 + lado3 * lado3);
        }
        else
        {
            return Math.sqrt(lado3 * lado3 - lado1 * lado1 + lado2 * lado2);
        }
    }
}
