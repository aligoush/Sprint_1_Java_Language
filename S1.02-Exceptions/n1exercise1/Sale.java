package n1exercise1;

import java.util.ArrayList;

public class Sale {
    protected ArrayList<Product> products;
    private double totalPrice;
    public Sale () {
        this.products = new ArrayList<Product>();
    }
    public void calculateTotal() {
        try{
            if(products.isEmpty()){
                throw new SalesEmptyException("In order to buy something you need to add a product");
            }
        } catch(SalesEmptyException e) {
            System.out.println("The exception was thrown with message: " + e.getMessage());
        }
        for (Product item: products) {
            this.totalPrice = item.getPrice() + this.totalPrice;
        }
        System.out.println("Total price: " + this.totalPrice);
    }


}
