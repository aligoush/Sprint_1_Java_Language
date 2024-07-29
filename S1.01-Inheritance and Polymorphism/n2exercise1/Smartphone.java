package n2exercise1;

public class Smartphone extends Telephone implements Camara, Clock{
    public Smartphone(String marca, String model){
        super(marca, model);
    }
    @Override
    public void makePhoto(){
        System.out.println("You're taking photo");
    }

    @Override
    public void alarm() {
        System.out.println("The alarm is ringing");
    }

}
