package mystore;

public class PhoneTest {

    public static void main(String[] args) {
        Android testPhoneOne = new Android("867-5309", 50);

        Iphone testPhoneTwo = new Iphone("123-4567", 60);

        testPhoneOne.voiceActivatedCall("Bobert");
        testPhoneTwo.voiceActivatedCall("Robert");

        YeOldePhone testPhoneThree = new YeOldePhone("444-4444");
        testPhoneThree.voiceActivatedCall("Bill");


    }

}
