public class Gato extends Animal {
    public Gato() {
        super("Gatinho", "Preta");
    }

    public void mia() {
        System.out.println(getNome() + " está miando.");
    }
}