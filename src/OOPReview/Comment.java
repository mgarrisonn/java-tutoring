package OOPReview;

public class Comment extends Message {
    private long postId;

    public Comment(String content, String language, User author, long postId) {
        super(content, language, author);
        this.postId = postId;
    }

}
