package n1exercise1;

public class Main {
    public static void main(String[] args) {

        Instrument flauta = new Vent("Flauta", 300);
        Instrument violí = new Corda("Violí", 700);
        Instrument tambor = new Percussió("Tambor", 101.50);
        System.out.println(flauta.nom + " : " + flauta.preu + "eu");
        flauta.tocar();
        System.out.println(violí.nom + " : " + violí.preu + "eu");
        violí.tocar();
        System.out.println(tambor.nom + " : " + tambor.preu + "eu");
        tambor.tocar();
        Vent.cridaMètodeEstàtic();

    }
}
