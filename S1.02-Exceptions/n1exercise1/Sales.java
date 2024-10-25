package n1exercise1;

import java.util.ArrayList;

public class Sales {
    protected ArrayList<Product> products;
    private double totalPrice;
    public Sales() {
        this.products = new ArrayList<Product>();
    }
    public void calculateTotal() throws SalesEmptyException {
        if(products.isEmpty()){
            throw new SalesEmptyException("In order to buy something you need to add a product");
        }
        for (Product item: products) {
            this.totalPrice = item.getPrice() + this.totalPrice;
        }
        System.out.println("Total price: " + this.totalPrice);
    }


}
