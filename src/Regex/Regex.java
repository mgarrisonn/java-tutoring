package Regex;

import java.util.ArrayList;
import java.util.Scanner;

public class Regex {
    Scanner scanner = new Scanner(System.in);

    private static PasswordValidator validator = new PasswordValidator();

    public static void main(String[] args) {
        fizzBuzz("");

    }




    public int getInt() {
        String userInput = scanner.nextLine();
        if(userInput.matches(".*\\d.*")){
            return Integer.parseInt(userInput);
        } else {
            System.out.println("That isn't an integer. Try again.");
            return getInt();
        }

    }

    public static void fizzBuzz(String currentOutput){

        if(((currentOutput.split("\r\n|\r|\n").length) % 3 != 0) && ((currentOutput.split("\r\n|\r|\n").length) % 5 != 0)) {
            currentOutput += (currentOutput.split("\r\n|\r|\n").length);
        }

        if((currentOutput.split("\r\n|\r|\n").length) % 3 == 0 && !Character.isDigit((currentOutput.charAt(currentOutput.length() - 1)))){
            currentOutput += "Fizz";
        }

        if((((currentOutput.split("\r\n|\r|\n").length) % 5 == 0) && (currentOutput.substring(currentOutput.length() - 1).equalsIgnoreCase("\n")) && !Character.isDigit((currentOutput.charAt(currentOutput.length() - 1)))) || ((((currentOutput.split("\r\n|\r|\n").length) % 5 == 1)) && ((currentOutput.substring(currentOutput.length() - 1).equalsIgnoreCase("z"))))){
            currentOutput += "Buzz";
        }

        if((currentOutput.split("\r\n|\r|\n").length) <= 100) {
            currentOutput += "\n";
            fizzBuzz(currentOutput);
        }

        if ((currentOutput.split("\r\n|\r|\n").length) == 101) {
            currentOutput = currentOutput.substring(2);
            System.out.println(currentOutput);
        }

    }

    private static boolean lameValidator(String passwordToCheck){
        boolean passwordIsGood = true;
        int[] numberArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] specialCharacters = {"@", "#", "$", "%"};

        if(passwordToCheck.length() >= 20 || passwordToCheck.length() <= 6){
            passwordIsGood = false;
        }

        if(passwordToCheck.toUpperCase().equals(passwordToCheck) || passwordToCheck.toLowerCase().equals(passwordToCheck)){
            passwordIsGood = false;
        }
        for(int digit : numberArray){
            if(passwordToCheck.indexOf(digit) != -1){
                passwordIsGood = false;
            }
        }

        boolean foundALetter = false;
        for(String letter : alphabet){
            if(passwordToCheck.toLowerCase().indexOf(letter) != -1){
                foundALetter = true;
            }
        }

        if(!foundALetter){
            passwordIsGood = false;
        }

        boolean foundASpecialChar = false;
        for(String specialChar : specialCharacters){
            if(passwordToCheck.indexOf(specialChar) != -1){
                foundASpecialChar = true;
            }
        }
        if(!foundASpecialChar){
            passwordIsGood = false;
        }

        return passwordIsGood;
    }

//            System.out.println("lameValidator(\"test\") = " + lameValidator("test"));
//        System.out.println("lameValidator(\"P@ssw0rd\") = " + lameValidator("P@ssw0rd"));
//        System.out.println("lameValidator(\"3242\") = " + lameValidator("3242"));
//        System.out.println("lameValidator(\"P@ssw0rd\") = " + lameValidator("p@ssw0rd"));

}
