public class Corridinha {
    private double distancia;
    private int tempoEspera;
    private double tarifaBase;
    private double fatorDemanda;

    public Corridinha(double distancia, int tempoEspera, double tarifaBase, double fatorDemanda) {
        this.distancia = distancia;
        this.tempoEspera = tempoEspera;
        this.tarifaBase = tarifaBase;
        this.fatorDemanda = fatorDemanda;
    }

    public double calcularValorCorrida() {
        return (distancia * 2) + (tempoEspera * 0.5) + (tarifaBase * fatorDemanda);
    }

    public void exibirDetalhesCorrida() {
        double valorFinal = calcularValorCorrida();
        System.out.println("Informacoes da Corrida:");
        System.out.println("Distância: " + distancia + " km");
        System.out.println("A Espera foi de "+" " + tempoEspera + " minutos");
        System.out.println("Tarifa Base em reais são de "+" " + tarifaBase);
        System.out.println("Pessoas que precisavam naquela hora ou demanda por hora, como quiser chamar "+" " + fatorDemanda);
        System.out.println("Qual e o total da corrida? em R$ " + valorFinal);
    }
}