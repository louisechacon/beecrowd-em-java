import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int A = leitor.nextInt(); // equivalente a "leia_inteiro" no Potigol
        int B = leitor.nextInt();
        int X = A + B;
        
        System.out.print("X = ");
        System.out.println(X);
 
    }
 
}
