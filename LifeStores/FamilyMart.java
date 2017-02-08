import java.util.List;

/**
 * Created by jerome on 05/02/17.
 */
public class FamilyMart implements ConvenienceStore {

    private List<Product> products;
    private int nbEmploye;
    private int stock = 2;
    private int max = 2;

    public FamilyMart(List<Product> products, int nbEmploye) {
        this.products = products;
        this.nbEmploye = nbEmploye;
    }

    public void setNbEmploye(int nbEmploye) {
        this.nbEmploye = nbEmploye;
    }

    @Override
    public Boolean Sell(Product product) {
        for (Product prod: this.products) {
            if (prod.getName().equals(product.getName()) && nbEmploye>0){

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
        return "FamilyMart{" +
                "products=" + products +
                ", nbEmploye=" + nbEmploye +
                ", stock=" + stock +
                ", max=" + max +
                '}';
    }
}
