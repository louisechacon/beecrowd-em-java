import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
 
        Scanner leitor = new Scanner(System.in);
        
        String nome = leitor.nextLine();
        double salario = leitor.nextDouble();
        double total_vendas = leitor.nextDouble();
        
        double comissao = (total_vendas * 0.15);
        double total_ganho = salario + comissao;
        
        System.out.print("TOTAL = R$ ");
        System.out.printf("%.2f%n", total_ganho);
 
    }
 
}
