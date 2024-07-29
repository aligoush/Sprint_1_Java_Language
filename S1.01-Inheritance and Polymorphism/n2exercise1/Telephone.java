package n2exercise1;

public class Telephone {
    private String brand;
    private String model;
    public Telephone(String brand, String model){
        this.brand = brand;
        this.model = model;
    }
    public void call(String number){
        System.out.println("You are calling to number " + number);
    }
}
