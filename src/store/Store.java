package store;

import store.models.Bread;
import store.models.Chocolate;
import store.models.Coke;
import store.models.ProductForSale;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] products = new ProductForSale[5];
        products[0] = new Chocolate("sweet",13.4,"ch object","white",true);
        products[1]= new Bread("Bakery",5,"br test","einkorn","brown");
        products[2] = new Coke("Drinks",15,"soğuk içiniz",true,2.5);
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            if (product != null) {
                product.showDetails();
            }
        }
    }
}