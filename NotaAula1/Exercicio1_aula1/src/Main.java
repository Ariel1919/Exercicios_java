
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        Aluno p=new Aluno();





            System.out.println("Qual o seu nome ?");
            p.setNome(sc.next());


            System.out.println("Qual a sua idade?");
            p.setIdade(sc.nextInt());

            System.out.println("Qual seu curso?");
            p.setCurso(sc.next());


            System.out.println("Qual a sua 1 nota");
            p.setNotas1(sc.nextDouble());
            System.out.println("Qual a sua 2 nota");
            p.setNotas2(sc.nextDouble());
            System.out.println("Qual a sua 3 nota");
            p.setNotas3(sc.nextDouble());


            System.out.println(p.getdetalhes());

            p.getcalcularmedia(p.getNotas1(), p.getNotas2(), p.getNotas3());//metodo que foi chamado
            if(p.getMedia() >= 7.0){
                   System.out.println("Parabéns Média exclente(" + p.getMedia() + ") provado");
            }else if (p.getMedia() ==6.0){
                   System.out.println("Pode melhorar Média(" + p.getMedia() + ")Final");
            } else{
                   System.out.println("Reprovado(" + p.getMedia()+")");}

    }
}

