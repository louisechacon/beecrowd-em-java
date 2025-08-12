import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
 
        Scanner leitor = new Scanner(System.in);
        
        int numero = leitor.nextInt();
        int horas = leitor.nextInt();
        float valor_por_horas = leitor.nextFloat();
        float SALARY = (horas * valor_por_horas);
        
        System.out.print("NUMBER = ");
        System.out.println(numero);
        System.out.print("SALARY = U$ ");
        System.out.printf("%.2f%n", SALARY);
 
    }
 
}
