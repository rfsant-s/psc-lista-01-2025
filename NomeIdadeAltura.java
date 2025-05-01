
import java.util.Scanner;

public class NomeIdadeAltura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.next();
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();
        System.out.print("Olá, " + nome + ", sua idade é " + idade + ", sua altura é " + altura);

    }
}

