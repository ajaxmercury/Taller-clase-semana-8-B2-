import java.util.Date;

public class Main {
    public static void main(String[] args) {
        
        Circulo circulo = new Circulo(3);
        System.out.println("Área del círculo: " + circulo.CalcularArea());
        System.out.println("Perímetro del círculo: " + circulo.CalcularPerimetro());

        
        Cuadrado cuadrado = new Cuadrado(5);
        System.out.println("\nÁrea del cuadrado: " + cuadrado.CalcularArea());
        System.out.println("Perímetro del cuadrado: " + cuadrado.CalcularPerimetro());

        
        Date fechaNacimiento = new Date(90, 1, 5); 
        Persona persona = new Persona(fechaNacimiento);
        int[] edad = persona.calcularEdad();
        System.out.println("\nEdad de " +  ": " + edad[0] + " años, " + edad[1] + " meses, " + edad[2] + " días");

        
        Triangulo triangulo = new Triangulo(3, 4, 5);
        System.out.println("\nÁrea del triángulo: " + triangulo.CalcularArea());
        System.out.println("Perímetro del triángulo: " + triangulo.CalcularPerimetro());
        System.out.println("Hipotenusa del triángulo: " + triangulo.CalcularHipotenusa());
    }
}


