package n3exercise1;

public class Main {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone();
        GenericClass generic = new GenericClass();
        generic.genericMethodTelephone(phone);
        generic.genericMethodSmartphone(phone);
    }
}
