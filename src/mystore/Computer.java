package mystore;

public class Computer {
    private String OS;
    private boolean isLaptop;
    private String type;

    public Computer(boolean newIsLaptop, String newComputerType){
        this.isLaptop = newIsLaptop;
        this.type = newComputerType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }


}
