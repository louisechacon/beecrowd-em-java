import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Double x1 = leitor.nextDouble();
        Double y1 = leitor.nextDouble();
        Double x2 = leitor.nextDouble();
        Double y2 = leitor.nextDouble();

        Double distancia = Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));

        System.out.printf("%.4f%n", distancia);

    }

}