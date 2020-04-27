package mystore;

public class PhoneTest {

    public static void main(String[] args) {
        Android testPhoneOne = new Android("867-5309", 50);

        Iphone testPhoneTwo = new Iphone("123-4567", 60);

//        testPhoneOne.voiceActivatedCall("Bobert");
//        testPhoneTwo.voiceActivatedCall("Robert");

        YeOldePhone testPhoneThree = new YeOldePhone("444-4444");
//        testPhoneThree.voiceActivatedCall("Bill");

        Android newestTest = new Android("210-234-5678", 4.5);
        Phone secondNewestTest = new Android("123-456-7890", 7.80);
        Iphone thirdNewestTest = new Iphone("345-374-7353", 40);

        thirdNewestTest.setPrice(300);
        secondNewestTest.setPrice(400);

        System.out.println("thirdNewestTest.getPrice() = " + thirdNewestTest.getPrice());
        System.out.println("secondNewestTest.getPrice() = " + secondNewestTest.getPrice());

    }

}
