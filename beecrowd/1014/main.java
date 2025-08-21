import java.util.Scanner;
public class Main {
 
    public static void main(String[] args){
 
        Scanner leitor = new Scanner(System.in);
        
        int distancia = leitor.nextInt();
        double litros = leitor.nextDouble();
        double consumo_medio = (distancia / litros);
        
        System.out.printf("%.3f", consumo_medio);
        System.out.println(" km/l");
        
    }
 
}
