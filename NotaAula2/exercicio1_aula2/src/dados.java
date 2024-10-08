public class dados {
    protected String titular;
    protected double saldo;

    public dados(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Ishi ta quebrado");
        }
    }

    public void exibirDados() {
        System.out.println("Titular; " + titular);
        System.out.println("Quanto podemos gastar?; " + saldo);
    }
}