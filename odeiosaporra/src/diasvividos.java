import java.util.Scanner;
public class diasvividos {
    public static void main(String[]args) {
    int anos;

    System.out.println("olá!!! escreva seu nome");
        Scanner cnas = new Scanner(System.in);
        String nome = cnas.nextLine();
    System.out.println("Escreva a sua idade");
        Scanner scan = new Scanner(System.in);
        anos = scan.nextInt();

        int dias = anos * 365;

    System.out.println("olá "+ nome + " você viveu " + dias +" dias") ;
    }
    
    
}
