// Example from https://www.baeldung.com/java-static

package cars;

import java.util.ArrayList;

public class Car {
    private String name;
    private String manufacturer;

    private static int numberOfCars;
    private static ArrayList<Car> allCars = new ArrayList<>();

    public Car(String name, String manufacturer) {
        this.name = name;
        this.manufacturer = manufacturer;
        numberOfCars++;
        allCars.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public static int getNumberOfCars(){
        return Car.numberOfCars;
    }

    public static void showAllCars(){
        for(Car car : allCars){
            System.out.println("car.getName() = " + car.getName());
            System.out.println("car.getManufacturer() = " + car.getManufacturer());
        }
    }

    private double pi = Math.PI;

}
