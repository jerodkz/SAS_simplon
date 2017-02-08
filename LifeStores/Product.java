/**
 * Created by jerome on 03/02/17.
 */
public class Product {

    private String name;
    private Float price;

    public Product(String name,Float price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
