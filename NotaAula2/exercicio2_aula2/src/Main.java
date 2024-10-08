import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual foi a distancia percorrida?Trabalhamos em km;");
        double distancia = scanner.nextDouble();

        System.out.println("Qual foi o tempo de espera pelo carro?Trabalhamos com minutos?;");
        int tempoEspera = scanner.nextInt();

        System.out.println("Qual e a tarifa base desta corrida?Trabalhamos com R$;");
        double tarifaBase = scanner.nextDouble();

        System.out.println("Quantas pessoas precisavam do servico neste horario?;");
        double fatorDemanda = scanner.nextDouble();

        Corridinha corrida = new Corridinha(distancia, tempoEspera, tarifaBase, fatorDemanda);
        corrida.exibirDetalhesCorrida();
    }
}