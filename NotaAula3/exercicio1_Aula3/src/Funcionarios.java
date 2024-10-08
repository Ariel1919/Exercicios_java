public class Funcionarios {
    private String nome;
    private String dataNasc;
    private double salario;

    public Funcionarios(String nome, String dataNasc, double salario) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int calcularIdade() {
        return 0;
    }
}