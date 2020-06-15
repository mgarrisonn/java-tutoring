package peoplestuff;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(){};

    public Person(String newPersonFirstName, String newPersonLastName, int newPersonAge){
        this.firstName = newPersonFirstName;
        this.lastName = newPersonLastName;
        this.age = newPersonAge;
    }

    public String getFirstName(){ return formatName(this.firstName); }

    public void setFirstName(String thisPersonsFirstName){
        this.firstName = thisPersonsFirstName;
    }

    public String getLastName() {
        return formatName(lastName);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String sayHello(){
        return String.format("Hello from %s %s!", firstName, lastName);
    }

    private static String formatName(String nameToFormat){
        return nameToFormat.substring(0, 1).toUpperCase() + nameToFormat.substring(1).toLowerCase();
    }

    public String greetSomeoneElse(Person personToGreet){
        return String.format("%s says \"Oh hi, %s\"", this.getFirstName(), personToGreet.getFirstName());
    }
}
