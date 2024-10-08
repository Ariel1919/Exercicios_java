public class Main {
    public static void main(String[] args) {
        Funcionarios[] funcionarios = new Funcionarios[2];

        Gerentes g = new Gerentes("Anacleto", "1800-05-10", 7000, "Projeto tal tal");
        funcionarios[0] = g;

        Programadores p = new Programadores("It a coisa", "1000-08-25", 4000, "Java");
        funcionarios[1] = p;

        for (Funcionarios func : funcionarios) {
            System.out.println("Nome= " + func.getNome());
            System.out.println("Data de Nascimento/ Aniversario= " + func.getDataNasc());
            System.out.println("Salário= " + func.getSalario());
            if (func instanceof Gerentes) {
                System.out.println("Projeto de tal gerente= " + ((Gerentes) func).getProjeto());
            } else if (func instanceof Programadores) {
                System.out.println("Linguagem do tal programador= " + ((Programadores) func).getLinguagem());
            }
            System.out.println();
        }
    }
}