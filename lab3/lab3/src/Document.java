public class Document extends  File {
    private String title;
    private String author;
    private String signature;

    public Document(String title, String author, String signature) {
        this.title = title;
        this.author = author;
        this.signature = signature;
    }

    @Override
    public String toString() {
        return "document";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
