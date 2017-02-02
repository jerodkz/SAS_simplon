package exercices.lifegarage;

/**
 * Created by jerome on 02/02/17.
 */
public class Bike extends Vehicle {

    public Bike(String brand, Color color, Float price) {

        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public float getPriceWithTax() {
        float tax = 1f;
        return price += tax;
    }
}
