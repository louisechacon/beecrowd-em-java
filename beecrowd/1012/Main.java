import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
            
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();
        
        double area_triangulo_retangulo = (A * C) / 2;
        double area_circulo = (3.14159 * (C * C));
        double area_trapezio = ((A + B) * C / 2);
        double area_quadrado = B * B;
        double area_retangulo = A * B;
        
        System.out.print("TRIANGULO: ");
        System.out.printf("%.3f%n", area_triangulo_retangulo);
        System.out.print("CIRCULO: ");
        System.out.printf("%.3f%n", area_circulo);
        System.out.print("TRAPEZIO: ");
        System.out.printf("%.3f%n", area_trapezio);
        System.out.print("QUADRADO: ");
        System.out.printf("%.3f%n", area_quadrado);
        System.out.print("RETANGULO: ");
        System.out.printf("%.3f%n", area_retangulo);
 
    }
 
}
