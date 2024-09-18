package n1exercise1;

abstract class Instrument {
    protected String name;
    protected double price;

    static {
        System.out.println("This the static initializer, it executes only once when the class is initialized or loaded for the first time. It executes after the class fields are initialized.");
    }

    public Instrument (String name, double price){
        this.name = name;
        this.price = price;
        System.out.println("This is the constructor of Instrument.");
    }

    {
        System.out.println("This is dynamic initialization block. The Java compiler inserts the code of the dynamic initializers into \" each constructor \"(at the beginning of its body).");
    }

    {
        System.out.println("Another dynamic initializer. They are only executed when a class object is created.");
    }

    static {
        System.out.println("Another static initialization block. They can occur anywhere in the class field.");
    }

    public abstract void play();

    static void callStaticMethod(){
        System.out.println("This is the static method called without instantiation");
    }

    @Override
    public String toString(){
        return this.name + ": " + this.price + "eu";
    }
}
