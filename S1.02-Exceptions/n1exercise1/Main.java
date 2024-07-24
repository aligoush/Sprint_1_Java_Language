package n1exercise1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Product manzanas = new Product("Manzana", 2.50);
        Product leche = new Product("Leche", 1.10);
        Product platanos = new Product("Platano", 4.30);

        Sale sale1 = new Sale();
        sale1.products.add(manzanas);
        sale1.products.add(leche);
        sale1.products.add(platanos);
        sale1.calculateTotal();

        // ArrayIndexOutOfBoundsException
        for(int i = 0; i <= 10; i++){
            sale1.products.get(i);
        }
    }


}
