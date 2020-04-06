package javareview;

// We need to make a Clerk class that extends Human
// The Clerk will be at the front desk to accept incoming computers
// The Clerk should have a method called
// receiveComputer(Computer brokeComp, ArrayList<Computer> brokenPile)
// that accepts a computer and an ArrayList
// and the Clerk puts the computer in the brokenComputer pile
// Why do we need to have an ArrayList as a parameter
// Can we make this work without the parameter? I'm actually asking if someone has another idea.

import java.util.ArrayList;

public class Clerk extends Human {
    public Clerk(String name) {
        // Clerk constructor just calls the super constructor from the Human class it is extending
        super(name);
    }

    // First parameter is the computer that is currently broken and needs to be added to the stores broken pile
    // We don't know what store the Clerk will be at so the second parameter tells the Clerk where to put the computer
    public void receiveComputer(Computer incomingBrokenComputer, ArrayList<Computer> thisStoresBrokenComputerPile){
        thisStoresBrokenComputerPile.add(incomingBrokenComputer);
    }

    // This works the same as receive computer except the first parameter is a Customer and we take the Computer from the Customer
    // The second parameter is still the pile where the Clerk needs to put the Computer
    public void customerService(Customer customerCurrentlyComplaining, ArrayList<Computer> thisStoresBrokenPile){
        Computer thisCustomersComputer = customerCurrentlyComplaining.getPersonalComputer();
        thisStoresBrokenPile.add(thisCustomersComputer);
    }
}
