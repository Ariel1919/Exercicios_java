public class Programadores extends Funcionarios {
    private String linguagem;

    public Programadores(String nome, String dataNasc, double salario, String linguagem) {
        super(nome, dataNasc, salario);
        this.linguagem = linguagem;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }
}