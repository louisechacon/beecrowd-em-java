import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int idadeEmDias = sc.nextInt();
        
        int anos = idadeEmDias / 365;
        int resto = idadeEmDias % 365;
        
        int meses = resto / 30;
        
        int dias = resto % 30;
        
        System.out.print(anos);
        System.out.println(" ano(s)");
        
        System.out.print(meses);
        System.out.println(" mes(es)");
        
        System.out.print(dias);
        System.out.println(" dia(s)");
 
    }
 
}