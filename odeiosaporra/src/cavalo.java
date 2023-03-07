import java.util.Scanner;
public class cavalo {
    public static void main(String[]args) {
        int cavalo;

        System.out.println("Escreva o numero de cavalos ");
        Scanner scan = new Scanner(System.in);
        cavalo = scan.nextInt();

        int area = (cavalo * 4);
        System.out.print("O numero de ferraduras sera " + area);

    }
}

