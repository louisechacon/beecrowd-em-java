import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
    
        Scanner leitor = new Scanner(System.in);
        
        int codigo1 = leitor.nextInt();
        int numero_pecas1 = leitor.nextInt();
        double valor1 = leitor.nextDouble();
        
        int codigo2 = leitor.nextInt();
        int numero_pecas2 = leitor.nextInt();
        double valor2 = leitor.nextDouble();
        
        double valor_pago1 = (numero_pecas1 * valor1);
        double valor_pago2 = (numero_pecas2 * valor2);
        
        System.out.print("VALOR A PAGAR: R$ ");
        System.out.printf("%.2f%n", valor_pago1 + valor_pago2);
    }
}
