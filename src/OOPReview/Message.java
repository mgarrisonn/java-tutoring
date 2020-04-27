package OOPReview;

public class Message {
    private String content;
    private String language;
    private User author;

    public Message() {
    }

    public Message(String content, String language, User author) {
        this.content = content;
        this.language = language;
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

}
