package mystore;

public class Android extends Phone {

    public Android(String androidNumber, double androidScreenSize){
        super(androidNumber, androidScreenSize);
        this.OS = "Android";
    }

    public void voiceActivatedCall(String contactName){
        System.out.println("Ok Google. Call " + contactName);
    }
}
