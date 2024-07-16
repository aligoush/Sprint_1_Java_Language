package n1exercise2;

public class Main {
    public static void main(String[] args) {
        Cotxe cotxe1 = new Cotxe();

        System.out.println(Cotxe.marca); // accés sense creació d'objecte
        // Cotxe.marca = "fsdf"; error -> variable final, no es pot canviar

        System.out.println(Cotxe.model);
        Cotxe.model = "Defender"; // accés sense creació d'objecte
        System.out.println(Cotxe.model);

        // cotxe1.potència = 145; error -> variable final, no es pot canviar
        System.out.println(cotxe1.potència);

        Cotxe.frenar();
        cotxe1.accelerar();

    }
}
