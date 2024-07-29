package n1exercise2;

public class Main {
    public static void main(String[] args) {
        Cotxe cotxe1 = new Cotxe();

        System.out.println(Cotxe.getMarca());


        System.out.println(Cotxe.getModel());
        Cotxe.setModel("Defender");
        System.out.println(Cotxe.getModel());


        System.out.println(cotxe1.getPotencia());

        Cotxe.frenar();
        cotxe1.accelerar();

    }
}
