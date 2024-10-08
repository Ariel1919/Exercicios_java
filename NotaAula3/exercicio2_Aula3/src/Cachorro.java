public class Cachorro extends Animal {
    public Cachorro() {
        super("Cahorrinho", "Caramelo");
    }

    public void late() {
        System.out.println(getNome() + " está latindo.");
    }
}