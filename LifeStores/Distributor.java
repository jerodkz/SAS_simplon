import java.util.List;

/**
 * Created by jerome on 03/02/17.
 */

public class Distributor implements ConvenienceStore {

    private List<Product> products;

    private int stock = 5;
    private int max = 5;

    public Distributor(List products){

        this.products = products;
    }


    /*@Override
    public Boolean Sell(Product product) {
        if (products.contains(product) == true) {
            products.remove(product);
            stock = stock - 1;
            return true;
        } else {
            return false;
        }
    }*/

    @Override
    public Boolean Sell(Product product) {
        for (Product prod: this.products) {
            if (prod.getName().equals(product.getName())){

                products.remove(prod);
                stock = stock - 1;
                return true;
            }
        }
        return false;
    }


    @Override
    public Boolean filled() {
        if (stock >= max){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Distributor{" +
                "products=" + products +
                ", stock=" + stock +
                ", max=" + max +
                '}';
    }



}
