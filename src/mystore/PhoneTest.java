package mystore;

public class PhoneTest {
    public static void main(String[] args) {
        Android myAndroid = new Android(40.5, "210-123-4567", "Galaxy SXX");
        Iphone myIphone = new Iphone(40.5, "210-456-7890", "6S");

        Phone genericPhone = new Android(50.5, "111-123-4567", "Galaxy SXX");

        myAndroid.makeCall(myIphone);
    }
}
