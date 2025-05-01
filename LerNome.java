
import java.util.Scanner;

public class LerNome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite seu nome :");
        String nome = scanner.next();

        System.out.println("Olá " + nome + " Seja bem vindo(a)!");
        }
}
