import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produto p = new Produto(1, "coelho", "G", "rosa", 9900.00, 90);

        System.out.println("Bem-vindo ao Sistema de Controle de Estoque!");
        System.out.println("O produto e| " + p.getNome());
        System.out.println("O codigo do produto e| " + p.getCodigo());
        System.out.println("O preco e|" + p.getValor());
        System.out.println("O estoque e| " + p.getEstoque());

        System.out.println("Quantos vai vender agora?");
        int vendas = scanner.nextInt();

        if (vendas > p.getEstoque()) {
            System.out.println("Infelizmente n temos o bastante");
        } else {
            p.atualizarEstoque(vendas);
            double total = p.getValor() * vendas;

            System.out.println("Tipos de pagamentos a seguir");
            System.out.println("1-Especie");
            System.out.println("2-Pix");
            System.out.println("3-Transferencia");
            System.out.println("4-Debito");
            System.out.println("5-Credito");

            int opcaoPagamento = scanner.nextInt();
            double desconto = 0.05;
            double pago;
            double troco = 0;

            switch (opcaoPagamento) {
                case 1:
                case 2:
                case 3:
                case 4:
                    total *= (1 - desconto);
                    if (opcaoPagamento == 2) {
                        System.out.println("Qual o valor?");
                        pago = scanner.nextDouble();
                        if (pago > total) {
                            troco = pago - total;
                        }
                    }break;

                    case 5:
                        System.out.println("Da pra parcelar em 3x sem juros. vamos la!");
                        break;
                        default:
                            System.out.println("Reveja as opções de pagamento pfvvv");
                            return;
                    }

                    System.out.println("Pagamento realizado volte sempre");
                    System.out.println("A venda rendeu| " + total);
                    if (troco > 0) {
                        System.out.println("Troco a ser dado| " + troco);
                    }
                    System.out.println("O que ainda temos aqui no estoque?| " + p.getEstoque());
                }
        scanner.close();
    }
}
