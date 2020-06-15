package peoplestuff;

public class SocialInteraction {
    public static void main(String[] args) {
        Person brance =  new Person("brance", "alexander", 31);
        Person johnny = new Person("Johnny", "Delgado", 35);


        brance.greetSomeoneElse(johnny);
    }

    private static void highFive(Person highFiver, Person highFivee){
        System.out.printf("%s slaps the hand of %s!", highFiver.getFirstName(), highFivee.getFirstName());
    }
}
