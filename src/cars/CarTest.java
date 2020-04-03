package cars;

public class CarTest {
    public static void main(String[] args) {
        Car testCarOne = new Car("El Camino", "Chevrolet");
        Car testCarTwo = new Car("Pinto", "Ford");

        System.out.println("Car.numberOfCars = " + Car.getNumberOfCars());
        Car.showAllCars();

        Car testCarThree = new Car("Gremlin", "Ford");

        System.out.println("Car.numberOfCars = " + Car.getNumberOfCars());
        Car.showAllCars();

    }
}
