package javareview;
// BranceTech.java is our store and where everything happens
// It needs to have 2 static properties that are both ArrayLists<Computer> of computers
// One ArrayList should be named brokenComputers and the other
// should be named fixedComputers

// Does this work?
// Add two more static properties in BranceTech.java
// Make one Clerk and one Repairer
// Make some computers in BranceTech.java main method and call the clerk's receive computer method
// over and over again and pass the computers to it one at a time.
// The broken pile should have all the computers given to the clerk.
// Everytime the repairer's repairComputer method is called a computer should be taken from the brokenPile and put into the fixedPile
// with the isBroken property set to false.

import java.util.ArrayList;

public class BranceTech {
    // These ArrayLists are static and are specific to the BranceTech class
    private static ArrayList<Computer> brokenComputers = new ArrayList<>();
    private static ArrayList<Computer> fixedComputers = new ArrayList<>();

    // One instance of Clerk and one instance of Repairer for the store
    private static Clerk brance = new Clerk("Brance");
    private static Repairer johnny = new Repairer("Johnny");

    public static void main(String[] args) {
        Computer jimmysComputer = new Computer("Lapple", false, true);
        // Customer constructor accepts computer
        Customer jimmy = new Customer("Jimmy", jimmysComputer);
        // Computers for testing methods
        Computer testComputerOne = new Computer("Dell", false, true);
        Computer testComputerTwo = new Computer("Alienware", false, true);

        // Brance the clerk receives computers
        brance.receiveComputer(testComputerOne, brokenComputers);
        brance.receiveComputer(testComputerTwo, brokenComputers);
        brance.customerService(jimmy, brokenComputers);

        // Loop shows that all computers have been added to the broken pile.
        for(Computer computer : brokenComputers){
            System.out.println("computer.getName() = " + computer.getName());
        }

        // Johnny the Repairer fixes two computers
        johnny.repairComputer(brokenComputers, fixedComputers);
        johnny.repairComputer(brokenComputers, fixedComputers);

        // We loop again to show that the broken pile only has one computer in it
        System.out.println("---------");
        for(Computer computer : brokenComputers){
            System.out.println("computer.getName() = " + computer.getName());
        }

        // We loop through the fixed pile and see the two computers that Johnny the Repairer has fixed
        System.out.println("---------");
        for(Computer computer : fixedComputers){
            System.out.println("computer.getName() = " + computer.getName());
            System.out.println("computer.isBroken() = " + computer.isBroken());
        }
    }
}


// We're going to make a computer repair shop.
// First we need to make a computer object.
// The computer object should have 3 properties
// 1. A string for the computer name
// 2. A boolean isPowerOn
// 3. A boolean isBroken
// All properties need getters and setters EXCEPT isBroken needs a getter but NO SETTER
// and a constructor

// One day we will want to repair more than just computers
// Create an interface for electronics
// It should be named Electronic and have two methods turnOn() and turnOff() that don't return anything
// Have the Computer object implement the Electronics interface
// Implement all the methods from the interface
// Anytime a computer's isPowerOn boolean is changed from false to true
// there needs to be a 20% chance that the isBroken property is changed to false if it is currently true.
// BranceTech.java is our store and where everything happens
// It needs to have 2 static properties that are both ArrayLists
// One ArrayList should be named brokenComputers and the other should be named fixedComputers

// We need people to work at BranceTech
// I already have a Person class in this project so we're going to make a Human class
// Humans should have a firstName and lastName properties with getters setters and a constructor

// We need to make a Clerk class that extends Human
// The Clerk will be at the front desk to accept incoming computers
// The Clerk should have a method called receiveComputer(Computer brokeComp, ArrayList<Computer> brokenPile)
// that accepts a computer and an ArrayList
// and the Clerk puts the computer in the brokenComputer pile
// Why do we need to have an ArrayList as a parameter
// Can we make this work without the parameter? I'm actually asking if someone has another idea.

// Our final class is Repairer that extends Human
// The Repairer repairs computers and should have a method called repairComputer()
// repairComputer should take in two arguments that are both ArrayLists.
// One ArrayList should be a list of broken computers for the Repairer to take from
// The other ArrayList should be a list of fixed computers for the Repairer to put the computer once it works.
// When repairComputer is called the Repairer should take a computer from the broken pile, fix it and put it in the fixed pile.
// Remember that there is not a setter for isBroken so the Repairer has to figure something else out.

// Does this work?
// Add two more static properties in BranceTech.java
// Make one Clerk and one Repairer
// Make some computers in BranceTech.java main method and call the clerk's receive computer method
// over and over again and pass the computers to it one at a time.
// The broken pile should have all the computers given to the clerk.
// Everytime the repairer's repairComputer method is called a computer should be taken from the brokenPile and put into the fixedPile
// with the isBroken property set to false.