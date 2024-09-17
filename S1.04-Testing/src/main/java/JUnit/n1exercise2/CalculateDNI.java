package JUnit.n1exercise2;

public class CalculateDNI {
    private int DNI;
    public static char calculateDNI(int DNINumber){
        String dniLetters = "TRWAGMYFPDXBNJZSQVHLCKE";
        char letter = dniLetters.charAt(DNINumber % 23);
        return letter;
    }

    public static void main(String[] args) {
        System.out.println(calculateDNI(12345678));
    }
}
