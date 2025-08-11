import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
 
        int A = leitor.nextInt();
        int B = leitor.nextInt();
        int C = leitor.nextInt();
        int D = leitor.nextInt();
        int DIFERENCA = (A * B - C * D);
        
        System.out.print("DIFERENCA = ");
        System.out.println(DIFERENCA);
    }
 
}
