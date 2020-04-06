package javareview;

public class BranceTech {
    // We're going to make a computer repair shop.
    // First we need to make a computer object.
    // The computer object should have 3 properties
    // 1. A string for the computer name
    // 2. A boolean isPowerOn
    // 3. A boolean isBroken
    // All properties need getters and setters EXCEPT isBroken needs a getter but NO SETTER


    public static void main(String[] args) {

    }
}



















// One day we will want to repair more than just computers
// Create an interface for electronics
// It should be named Electronic and have two methods turnOn() and turnOff()
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
// The Clerk should have a method called receiveComputer(Computer brokeComp) that accepts a computer
// and the Clerk puts the computer in the brokenComputer pile(ArrayList)

// Our final class is Repairer that extends Human
// The Repairer repairs computers and should have a method called repairComputer()
// When repairComputer is called the Repairer should take a computer from the broken pile, fix it and put it in the fixed pile.
// Remember that there is not a setter for isBroken so the Repairer has to figure something else out.
