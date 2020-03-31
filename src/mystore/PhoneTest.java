package mystore;

public class PhoneTest {

    public static void main(String[] args) {
        Android testPhoneOne = new Android("867-5309", 50);

        System.out.println("testPhoneOne.getOS() = " + testPhoneOne.getOS());
        System.out.println("testPhoneOne.getNumber() = " + testPhoneOne.getNumber());

        testPhoneOne.callNumber();

        testPhoneOne.setPrice(100.99);

        System.out.println("testPhoneOne.getPrice() = " + testPhoneOne.getPrice());
    }

}
