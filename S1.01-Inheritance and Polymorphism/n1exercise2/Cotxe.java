package n1exercise2;

public class Cotxe {

    static final String marca = "Land Rover";
    static String model = "Range Rover Velar";
    final int potència = 180;
    /*
    No es pot inicialitzar cap atribut al constructor
    estàtics : es poden modificar al constructor
    final: es una constant
    public Cotxe (String marca, String model, int potència){

    }
     */

    public static void frenar(){
        System.out.println("El vehicle està frenant");
    }
    public void accelerar(){
        System.out.println("El vehicle està accelerant");
    }


}
