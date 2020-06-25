package mystore;

import peoplestuff.Person;

import java.util.List;

public class Cashier extends Person {
    public Cashier(String newPersonFirstName, String newPersonLastName, int newPersonAge) {
        super(newPersonFirstName, newPersonLastName, newPersonAge);
    }

    // enhanced for loop
    public double total(List<Product> cart){
        double sum = 0;
        for(Product item : cart){
            sum += item.getPrice();
        }
        return sum;
    }

    // for loop
//    public double total(List<Product> cart){
//        double sum = 0;
//        for(int i = 0; i < cart.size(); i++){
//            sum += cart.get(i).getPrice();
//        }
//        return sum;
//    }

}
