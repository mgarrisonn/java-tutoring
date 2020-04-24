package cars;

public class CarTest {
    public static void main(String[] args) {
        Car testCarOne = new Car("El Camino", "Chevrolet");
        Car testCarTwo = new Car("Pinto", "Ford");

        System.out.println("testCarOne.getName() = " + testCarOne.getName());
        System.out.println("Car.getNumberOfCars() = " + Car.getNumberOfCars());


        Car testCarThree = new Car("Gremlin", "Ford");
        System.out.println("Car.getNumberOfCars() = " + Car.getNumberOfCars());

        Car.showAllCars();

    }
}
