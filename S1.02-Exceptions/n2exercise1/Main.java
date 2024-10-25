package n2exercise1;

public class Main {
    public static void main(String[] args) {
        int input_0 = Input.readByte("Insert the byte: ");
        System.out.println("The byte inserted " + input_0);
        int input_1 = Input.readInt("Insert an integer: ");
        System.out.println("Int inserted: " + input_1);
        float input_2 = Input.readFloat("Insert a float: ");
        System.out.println("Float inserted: " + input_2);
        double input_3 = Input.readDouble("Insert a double: ");
        System.out.println("Double inserted: " + input_3);
        char input_4 = Input.readChar("Insert a character: ");
        System.out.println("Character inserted: " + input_4);
        String input_5 = Input.readString("Insert a text: ");
        System.out.println("Text inserted: " + input_5);
        Boolean input_6 = Input.readYesNo("Yes or No: ");
        System.out.println("Inserted: " + input_6);
    }
}
