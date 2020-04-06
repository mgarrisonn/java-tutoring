package javareview;


import java.util.ArrayList;

// Our final class is Repairer that extends Human
// The Repairer repairs computers and should have a method called repairComputer()
// repairComputer should take in two arguments that are both ArrayLists<Computer> of computers.
// One ArrayList should be a list of broken computers for the Repairer to take from
// The other ArrayList should be a list of fixed computers for the Repairer to put
// the computer once it works.
// When repairComputer is called the Repairer should take a computer from the broken pile,
// fix it and put it in the fixed pile.
// Remember that there is not a setter for isBroken so the Repairer has to figure something
// else out.
public class Repairer extends Human {
    public Repairer(String name) {
        // Repairer constructor just calls the super constructor from the Human class it is extending
        super(name);
    }

    // The 2 parameters tell the Repairer where to take broken Computers from and where to put them when they are fixed.
    public void repairComputer(ArrayList<Computer> thisStoresBrokenPile, ArrayList<Computer> thisStoresFixedPile){
        // Check to make sure the broken pile has computers in it
        if(!thisStoresBrokenPile.isEmpty()){
            // If there are computers in the broken pile then there will be a computer at index 0
            Computer computerToBeFixed = thisStoresBrokenPile.get(0);
            // Repairer turns it off and on again until the computer is no longer broken
            while(computerToBeFixed.isBroken()){
                computerToBeFixed.turnOff();
                computerToBeFixed.turnOn();
            }
            // Once fixed the computer is removed from the broken pile
            thisStoresBrokenPile.remove(0);
            // and added to the fixed pile
            thisStoresFixedPile.add(computerToBeFixed);
        }else {
            // This else statement is just for if there are no computers to be fixed.
            System.out.println("I guess I'll go home.");
        }
    }
}
