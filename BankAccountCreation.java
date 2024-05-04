import java.util.Scanner;

public class BankAccountCreation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        String agencia, nome;
        double saldo;

        System.out.println("Enter the agency:");
        agencia = sc.nextLine();
        System.out.println("Enter the account number:");
        numero = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        System.out.println("Enter the name:");
        nome = sc.nextLine();
        System.out.println("Enter the balance:");
        saldo = sc.nextDouble();

        System.out.println("Hello " + nome + ", thank you for creating an account with our bank. Your agency is " + agencia + ", account number " + numero + ", and your balance " + saldo + " is available for withdrawal.");
        sc.close();
    }
}
