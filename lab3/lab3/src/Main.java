public class Main {
    public static void main(String[] args) {
        Check c = new Check(34);
        Document d = new Document("title", "author", "sign");
        Receipt r = new Receipt();
        Invoice i = new Invoice();
        for (var file:
             File.Files) {
            System.out.println(file.toString());
        }
    }
}