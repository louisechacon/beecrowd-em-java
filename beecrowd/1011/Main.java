import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
 
       Scanner leitor = new Scanner(System.in);
       double raio = leitor.nextDouble();
       double pi = 3.14159;
       double volume = (4/3.0) * pi * (Math.pow(raio,3));
       
       System.out.print("VOLUME = ");
       System.out.printf("%.3f%n", volume);
 
    }
 
}
