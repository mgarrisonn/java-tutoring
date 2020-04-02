package mystore;

public class Iphone extends Phone {

    public Iphone(String number, double sS) {
        super(number, sS);
        this.OS = "iOS";
    }

    public boolean facialUnlock(String face){
        return true;
    }


}
