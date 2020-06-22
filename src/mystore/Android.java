package mystore;

public class Android extends Phone implements Product {
    private double price;
    private int stock;

    public Android(double screenSize, String number, String model) {
        super(screenSize, number, model);
        this.Os = "AndroidOS";
    }

    @Override
    public String getOs() {
        return Os;
    }

    @Override
    public void makeVoiceCall(String name) {
        System.out.println("Ok Google. Call " + name);
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getStock() {
        return stock;
    }

    @Override
    public void setStock(int newStock) {
        this.stock = newStock;
    }
}
