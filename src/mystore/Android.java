package mystore;

public class Android extends Phone {

    public Android(String number, double screenSize){
        super(number, screenSize);
        this.OS = "Android";
    }

    public void voiceActivatedCall(String contactName) {
        System.out.println("Ok Google. Call " + contactName);
    }
}
