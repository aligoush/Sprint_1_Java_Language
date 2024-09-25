package n1exercise1;

public class NoGenericMethods {
    private String argument1;
    private String argument2;
    private String argument3;

    public NoGenericMethods(String arg1, String arg2, String arg3) {
        this.argument1 = arg1;
        this.argument2 = arg2;
        this.argument3 = arg3;
    }

    public String getArgument1() {
        return argument1;
    }

    public void setArgument1(String argument1) {
        this.argument1 = argument1;
    }

    public String getArgument2() {
        return argument2;
    }

    public void setArgument2(String argument2) {
        this.argument2 = argument2;
    }

    public String getArgument3() {
        return argument3;
    }

    public void setArgument3(String argument3) {
        this.argument3 = argument3;
    }

    public static void main(String[] args) {
        NoGenericMethods obj1 = new NoGenericMethods("value1", "value2", "value3");
        NoGenericMethods obj2 = new NoGenericMethods("value2", "value3", "value1");

        System.out.println(obj1.getArgument1() + " " + obj1.getArgument2() + " " + obj1.getArgument3());
        System.out.println(obj2.getArgument1() + " " + obj2.getArgument2() + " " + obj2.getArgument3());
    }
}
