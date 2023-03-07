
import java.util.Scanner;

public class padaria
{
    public static void main(String[]args) {
        int qpão;
        int qbroa;


        System.out.println("Escreva o numero de pãos vendidos ");
        Scanner scan = new Scanner(System.in);
        qpão = scan.nextInt();

        System.out.println("Escreva o numero de broas vendidas ");
        Scanner cnas = new Scanner(System.in);
        qbroa = cnas.nextInt();

        double tpão = qpão * 0.12;
        double tbroa = qbroa * 1.15;

        double total = tpão+tbroa;
        double poupança = total * 0.10;

        System.out.println("valor arrecadado de broas "+ tbroa);
        System.out.println("valor arrecadado de pãos "+ tpão);
        System.out.println("valor total arrecadado "+ total);
        System.out.println("valor a se guardar "+ poupança);
    }
}