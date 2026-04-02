import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int ddd = sc.nextInt();
        
        String estado = switch (ddd) {
        
        case 61 -> "Brasilia";
        case 71 -> "Salvador";
        case 11 -> "Sao Paulo";
        case 21 -> "Rio de Janeiro";
        case 32 -> "Juiz de Fora";
        case 19 -> "Campinas";
        case 27 -> "Vitoria";
        case 31 -> "Belo Horizonte";
        default -> "DDD nao cadastrado";
        };
        
        System.out.println(estado);

        sc.close();
 
    }
 
}