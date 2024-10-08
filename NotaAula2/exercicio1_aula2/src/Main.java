import java.util.Scanner;
//questionamento pra dps e uma tentativa, talvez se colocasse um while pra os dois daria certo? ou um for?
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Conta_corrente cc = new Conta_corrente("Conta Corrente");
        Conta_poupanca cp = new Conta_poupanca("Conta Poupança");

        System.out.println("Qual é a sua conta?");
        System.out.println("1-Conta Corrente");
        System.out.println("2-Conta Poupança");
        int escolha = sc.nextInt();

        while (true) {
            if (escolha == 1) {
                Conta_corre(cc, sc);
            } else if (escolha == 2) {
                Conta_pou(cp, sc);
            } else {
                System.out.println("Não existe essa opção. Veja novamente.");
                System.out.println("Qual é seu tipo de conta?");
                System.out.println("1 - Conta Corrente");
                System.out.println("2 - Conta Poupança");
                escolha = sc.nextInt();
            }
        }
    }



    public static void Conta_corre(Conta_corrente cc, Scanner scanner) {
        int contador = 0;
        while (contador != 4) {
            System.out.println("Menu Conta Corrente:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Exibir informações");
            System.out.println("4 - Sair");
            contador = scanner.nextInt();

            if (contador == 1) {
                System.out.println("Valor=");
                cc.depositar(scanner.nextDouble());
            } else if (contador == 2) {
                System.out.println("Valor=");
                cc.sacar(scanner.nextDouble());
            } else if (contador == 3) {
                cc.exibirDados();
            } else if (contador == 4) {
                System.out.println("Ate mais Voltando pra tela inicial");
                break;
            } else {
                System.out.println("Reveja as opcoes");}
        }
    }



    public static void Conta_pou(Conta_poupanca cp, Scanner scanner) {
        int opcao = 0;
        while (opcao != 5) {
            System.out.println("Opcoes da conta Poupança");
            System.out.println("1-Depositar");
            System.out.println("2-Sacar");
            System.out.println("3-Calcular rendimento");
            System.out.println("4-Exibir dados");
            System.out.println("5-Sair");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Valor=");
                cp.depositar(scanner.nextDouble());
            } else if (opcao == 2) {
                System.out.println("Valor=");
                cp.sacar(scanner.nextDouble());
            } else if (opcao == 3) {
                System.out.println("olha a parte do selic ");
                cp.calcularRendimento(scanner.nextDouble());
            } else if (opcao == 4) {
                cp.exibirDados();
            } else if (opcao == 5) {
                System.out.println("Ate mais. Voltando pra tela inicial");
                break;
            } else {
                System.out.println("Reveja as opcoes");}
        }
    }
}