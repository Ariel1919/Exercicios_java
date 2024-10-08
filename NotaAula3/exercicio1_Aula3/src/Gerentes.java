public class Gerentes extends Funcionarios {
    private String projeto;

    public Gerentes(String nome, String dataNasc, double salario, String projeto) {
        super(nome, dataNasc, salario);
        this.projeto = projeto;
    }

    public String getProjeto() {
        return projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }
}