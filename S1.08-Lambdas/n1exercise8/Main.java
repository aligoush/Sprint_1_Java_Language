package n1exercise8;

public class Main {
    public static void main(String[] args) {
        ReversedText reversedtxt = word -> new StringBuilder(word).reverse().toString();
        System.out.println(reversedtxt.reverse("Barbarossa"));
    }
}
