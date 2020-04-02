package mystore;

public class YeOldePhone extends Phone {
    public YeOldePhone(String number){
        super(number);
        this.OS = "A real person";
    }

    public void voiceActivatedCall(String contactName) {
        System.out.println("User: Hello operator?");
        System.out.println("Operator: How can I help you?");
        System.out.println("User: Will you connect me to " + contactName);
        System.out.println("Of course. One moment.");
    }
}
