package n3exercise1;

public class Smartphone implements Telephone{
    public void makePhoto(){
        System.out.println("You're taking photo");
    }

    @Override
    public void call(String number) {
        System.out.println("You are calling to number " + number);
    }
}
