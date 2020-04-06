package javareview;

public class Customer extends Human {
    private Computer personalComputer;
    boolean isHappy;

    public Customer(String name, Computer newPersonsPersonalComputer) {
        super(name);
        this.personalComputer = newPersonsPersonalComputer;
        this.isHappy = false;
    }

    public Computer getPersonalComputer() {
        return personalComputer;
    }

    public void setPersonalComputer(Computer personalComputer) {
        this.personalComputer = personalComputer;
    }
}
