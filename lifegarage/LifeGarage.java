package exercices.lifegarage;

import java.util.ArrayList;
import java.util.List;

public class LifeGarage {

    public static void main(String[] args) {

        Car peugeot = new Car("Peugeot",Color.GREEN,1000f);
        Car volkswagen = new Car("Volkswagen",Color.BLUE,1500f);
        Car renault = new Car("Renault",Color.BLUE,2000f);

        List<Car> cars = new ArrayList<>();
        Garage garage = new Garage("garage", cars);

        garage.addCar(peugeot);
        garage.addCar(volkswagen);
        garage.addCar(renault);

        System.out.println(garage);
    }
}
