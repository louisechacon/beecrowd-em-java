import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
 
        Scanner leitor = new Scanner(System.in);
        
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();
        double MEDIA = ((A * 2) + (B * 3) + (C * 5)) / 10;
        
        System.out.print("MEDIA = ");
        System.out.printf("%.1f%n", MEDIA);
 
    }
 
}
