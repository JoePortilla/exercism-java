package SqueakyClean;

public class SqueakyClean {
    public static void main(String[] args) {
        System.out.println(clean("my   Id"));
    }

    public static String clean(String identifier) {
        String cleaned = "";
        cleaned = identifier.replaceAll(" ", "_");
        return cleaned;
    }
}
