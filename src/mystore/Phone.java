package mystore;

public abstract class Phone {
    private double screenSize;
    private String number;
    private String model;
    protected String Os;

    public Phone(double screenSize, String number, String model){
        this.screenSize = screenSize;
        this.number = number;
        this.model = model;
    }

    public Phone() {
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void makeCall(Phone phoneToCall){
        System.out.println("Calling: " + phoneToCall.getNumber() + ". From number " + this.number);
    }

    public abstract String getOs();

    public abstract void makeVoiceCall(String name);

}
