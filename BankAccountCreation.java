import java.util.Scanner;

public class BankAccountCreation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        String agencia, nome;
        double saldo;

        System.out.println("\nDigite a agencia:");
        agencia = sc.nextLine();
        System.out.println("Digite o numero da conta:");
        numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o nome:");
        nome = sc.nextLine();
        System.out.println("Digite o saldo:");
        saldo = sc.nextDouble();

        System.out.println("Olá "+ nome +", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");
        sc.close();
    }
}
