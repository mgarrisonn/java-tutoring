package mystore;

public abstract class Phone implements Products {

    protected String number;
    protected double screenSize;
    protected String OS;
    protected double price;
    protected int stock;

    public Phone(String number, double screenSize){
        this.number = number;
        this.screenSize = screenSize;
    }

    public Phone(String number){
        this.number = number;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void callNumber(){
        System.out.println("Calling phone number " + number);
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int getStock() {
        return stock;
    }

    @Override
    public void setStock(int stock) {
        this.stock = stock;
    }

    public abstract void voiceActivatedCall(String contactName);

}
