package n1exercise1;

public class Percussió extends Instrument{
    public Percussió(String nom, double preu) {
        super(nom, preu);
    }

    @Override
    public void tocar() {
        System.out.println("Està sonant un instrument de percussió");
    }
}
