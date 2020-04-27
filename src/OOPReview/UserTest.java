package OOPReview;

public class UserTest {

    public static void main(String[] args) {
        User brance = new User("javamancer", "brance@codeup.com", "abc123");
//        User jasmine = new User("mirafaun", "jasmine@gmail.com", "def456");
        
//        brance.addFriend(jasmine);
        
//        for(User friend : brance.getFriends()){
//            System.out.println("friend.getUsername() = " + friend.getUsername());
//            System.out.println("friend.getEmail() = " + friend.getEmail());
//        }

//        for(User friend : jasmine.getFriends()){
//            System.out.println("friend.getUsername() = " + friend.getUsername());
//            System.out.println("friend.getEmail() = " + friend.getEmail());
//        }

//        double[] test = new double[4];


        Post testPost = new Post("content", "Murican", brance, "subject", "google.com");
        Post defaultConstructorPost = new Post();

    }
    
}
