package n1exercise2;

public class Cotxe {

    private static final String marca;
    private static String model;
    private final int potencia;

    static {
        marca = "Land Rover";
        model = "Range Rover Velar";
    }
    public Cotxe(){
        potencia  = 180;
    }

    public int getPotencia() {
        return potencia;
    }

    public static String getMarca() {
        return marca;
    }

    public static String getModel() {
        return model;
    }

    public static void setModel(String model) {
        Cotxe.model = model;
    }

    public static void frenar(){
        System.out.println("El vehicle està frenant");
    }
    public void accelerar(){
        System.out.println("El vehicle està accelerant");
    }


}
