package mystore;

public class Iphone extends Phone implements Product {
    private double price;
    private int stock;

    public Iphone(double screenSize, String number, String model) {
        super(screenSize, number, model);
        this.Os = "iOS";
    }

    @Override
    public String getOs() {
        return Os;
    }

    @Override
    public double getPrice() {
        return price * 4;
    }

    @Override
    public int getStock() {
        return stock;
    }

    @Override
    public void setStock(int newStock) {
        this.stock = newStock;
    }

    @Override
    public void makeVoiceCall(String name) {
        System.out.println("Hey Siri. Call " + name);
    }
}
