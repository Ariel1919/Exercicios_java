public class Aluno {

    private int idade;
    private String nome;
    private String curso;
    private double notas1,notas2,notas3;
    //private double notas2;
    //private double notas3;
    private double media;


    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNotas1() {
        return notas1;
    }
    public void setNotas1(double notas1) {
        this.notas1 = notas1;
    }

    public double getNotas2() {
        return notas2;
    }
    public void setNotas2(double notas2) {
        this.notas2 = notas2;
    }

    public double getNotas3() {
        return notas3;
    }
    public void setNotas3(double notas3)
    {
        this.notas3 = notas3;
    }


    public void getcalcularmedia(double notas1,double notas2,double notas3) {
        media = (notas1 + notas2 + notas3) / 3;
    }//metodo que da o resultado

    public double getMedia() {
        return media;
    }//retorno de media separado pq tava perigando de dar erro ou seja aqui e so o resultado


    public char getdetalhes(){
        System.out.println("Nome do aluno(a):("+getNome()+")|Nome do curso:("+getCurso()+")|Idade:("+getIdade()+")|Notas 1:("+getNotas1()+")|Notas 2:("+getNotas2()+")|Notas 3:("+getNotas3()+")|Media:("+getMedia()+")|");
        return 0;

    }
}