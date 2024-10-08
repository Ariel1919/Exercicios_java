public class Conta_corrente extends dados {
    private double chequeEspecial = 1000;

    public Conta_corrente(String titular) {
        super(titular);
    }


    public void sacar(double valor) {
        if (saldo + chequeEspecial >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Ishi falido amigo");
        }
    }


    public void exibirDados() {
        super.exibirDados();
        System.out.println("O valor do cheque e= " + chequeEspecial);
    }
}