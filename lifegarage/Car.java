package exercices.lifegarage;

/**
 * Created by jerome on 01/02/17.
 */
public class Car extends Vehicle {

    public Car(String brand, Color color, Float price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public float getPriceWithTax() {
        float tax = 2f;
        return price += tax;
    }
}
