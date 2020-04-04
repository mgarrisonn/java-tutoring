package codeproblems;

import java.util.ArrayList;

public class ProblemSolving {
    public static void main(String[] args) {
        System.out.println("isIsogram(\"Test\") = " + isIsogram("Test"));
        System.out.println("isIsogram(\"dog\") = " + isIsogram("dog"));
        System.out.println("isIsogram(\"noideas\") = " + isIsogram("noideas"));
    }
    //Write a method called currencyFormatter that accepts a double and
    // returns a string with the double formatted to display the double as US dollars.

    //Write a method: public static
    //returns a string
    //Named currencyFormatter
    //Accepts a double
    //return string formatted as US dollars. ex 123.6 output $123.60

    private static String currencyFormatter(double doubleToFormatIntoUsDollars){
        String returnSting = String.format("$%.2f", doubleToFormatIntoUsDollars);
        return returnSting;
    }

    //Write a method called isIsogram()
    //isogram either has no repeating letters or every letter repeats the same number times.
    //accepts a string
    //returns a boolean

    private static boolean isIsogram(String wordToCheckIfItIsAnIsogram){
        //Split the string into an array where each element is a letter
        String[] arrayOfLettersInTheWord = wordToCheckIfItIsAnIsogram.split("");
        //Add each letter to this array as we loop through
        ArrayList<String> lettersWeHaveFoundSoFar = new ArrayList<>();
        //Return this boolean at the end
        boolean returnBoolean = true;
        //Iterates through every letter
        for(String letter : arrayOfLettersInTheWord){
            //If the letter has been pushed into the arraylist then changes return boolean to false because the letter has been repeated
            if(lettersWeHaveFoundSoFar.contains(letter.toLowerCase())){
                returnBoolean = false;
            }

            //Add each letter to arraylist
            lettersWeHaveFoundSoFar.add(letter.toLowerCase());

        }

        return returnBoolean;
    }
}
