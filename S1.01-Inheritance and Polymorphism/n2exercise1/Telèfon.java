package n2exercise1;

public class Telèfon {
    private String marca;
    private String model;
    public Telèfon(String marca, String model){
        this.marca = marca;
        this.model = model;
    }
    public void trucar(String numTelèfon){
        System.out.println("S’està trucant al número " + numTelèfon);
    }
}
