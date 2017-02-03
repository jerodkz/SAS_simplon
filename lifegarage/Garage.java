/**
 * Created by jerome on 02/02/17.
 */
package exercices.lifegarage;

import java.util.ArrayList;
import java.util.List;


public class Garage {
    private String name ;
    private List<Car> cars ;//= new ArrayList<>()
    
    public Garage(String name,List cars) {
        this.name = name;
        this.cars = cars;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    @Override
    public String toString() {
        return "Le nom du garage est " + name + "\' il contient les voitures:\n " + cars + '}';
    }
}
