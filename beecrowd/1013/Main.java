import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
 
        Scanner leitor = new Scanner(System.in);
        int A = leitor.nextInt();
        int B = leitor.nextInt();
        int C = leitor.nextInt();
        
        int maior_entre_AB = (A + B + Math.abs(A - B)) / 2;
        int maior_entre_ABC = (maior_entre_AB + C + Math.abs(maior_entre_AB - C)) / 2;
        
        System.out.print(maior_entre_ABC);
        System.out.println(" eh o maior");
 
    }
 
}
