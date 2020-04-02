package peoplestuff;

public class SocialInteraction {
    public static void main(String[] args) {
        Person test =  new Person("brance", "alexander", 31);
        Person testTwo = new Person("Johnny", "Delgado", 35);

//        System.out.println(test.greetSomeoneElse(testTwo));


        highFive(test, testTwo);
    }

    private static void highFive(Person highFiver, Person highFivee){
        System.out.printf("%s slaps the hand of %s!", highFiver.getFirstName(), highFivee.getFirstName());
    }
}
