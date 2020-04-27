package OOPReview;

import java.util.ArrayList;

public class Post extends Message {
    private String subject;
    private String imageUrl;
    private long id;

    public Post() {
    }

    public Post(String content, String language, User author, String subject, String imageUrl) {
        super(content, language, author);
        this.subject = subject;
        this.imageUrl = imageUrl;
    }


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
