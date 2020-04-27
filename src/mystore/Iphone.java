package mystore;

public class Iphone extends Phone {

    public Iphone(String number, double sS) {
        super(number, sS);
        this.OS = "iOS";
    }

    public double getPrice(){
        return price * 4;
    }

    public boolean facialUnlock(String face){
        return true;
    }

    public void voiceActivatedCall(String contactName){
        System.out.println("Ok Siri. Call " + contactName);
    }

}
