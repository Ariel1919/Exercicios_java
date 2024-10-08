public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        System.out.println("Nome"+" "+ cachorro.getNome());
        System.out.println("Raça"+" "+ cachorro.getRaca());
        cachorro.caminha();
        cachorro.late();

        System.out.println();

        System.out.println("Nome"+" " + gato.getNome());
        System.out.println("Raça"+" "+ gato.getRaca());
        gato.caminha();
        gato.mia();
    }
}