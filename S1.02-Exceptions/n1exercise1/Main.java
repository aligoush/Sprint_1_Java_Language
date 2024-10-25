package n1exercise1;

public class Main {
    public static void main(String[] args) {
        Product manzanas = new Product("Manzana", 2.50);
        Product leche = new Product("Leche", 1.10);
        Product platanos = new Product("Platano", 4.30);

        Sales sale1 = new Sales();
        sale1.products.add(manzanas);
        sale1.products.add(leche);
        sale1.products.add(platanos);

        try{
            sale1.calculateTotal();
        } catch (SalesEmptyException e){
            System.out.println(e.getMessage());
        }
        // ArrayIndexOutOfBoundsException
        try{
            for(int i = 0; i <= 10; i++){
                sale1.products.get(i);
            }
        } catch(IndexOutOfBoundsException e){
            e.getMessage();
        }
    }
}
