public class Produto {
    private int codigo;
    private String nome;
    private String peso;
    private String cor;
    private double valor;
    private int estoque;

    public Produto(int codigo, String nome, String peso, String cor, double valor, int estoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.peso = peso;
        this.cor = cor;
        this.valor = valor;
        this.estoque = estoque;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String peso() {
        return peso;
    }

    public String getCor() {
        return cor;
    }

    public double getValor() {
        return valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void estoque(int estoque) {
        this.estoque = estoque;
    }

    public void atualizarEstoque(int quantidade) {
        this.estoque -= quantidade;
    }
}