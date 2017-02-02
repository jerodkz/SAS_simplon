package exercices.lifegarage;

/**
 * Created by jerome on 02/02/17.
 */
public abstract class Vehicle {

    protected String brand;
    protected Color color;
    protected float price;

    public abstract float getPriceWithTax();

    @Override
    public String toString() {
        return  "brand='" + brand + '\'' + ", color=" + color + ", price=" + getPriceWithTax() + "}\n";
    }

}
