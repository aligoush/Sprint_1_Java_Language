package n3exercise1;

public class GenericClass {
    public <T extends Telephone> void genericMethodTelephone (T t){
        t.call("378746932");
        //t.makePhoto();
    }

    public <T extends Smartphone> void genericMethodSmartphone (T t){
        t.makePhoto();
        t.call("869776954");
    }

}
