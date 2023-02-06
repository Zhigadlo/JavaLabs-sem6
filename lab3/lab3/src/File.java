import java.util.ArrayList;

abstract class File {
    private String content;
    public static ArrayList<File> Files = new ArrayList<>();
    public File(){
        Files.add(this);
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "file";
    }
}
