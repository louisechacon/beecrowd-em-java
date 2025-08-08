import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int A = leitor.nextInt();
        int B = leitor.nextInt();
        int PROD = A * B;
        
        System.out.print("PROD = ");
        System.out.println(PROD);
 
    }
 
}
