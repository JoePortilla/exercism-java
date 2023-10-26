public class MicroBlog {
    public static void main(String[] args) {
        System.out.println(truncate("Transversalidad es una palabra larga"));
    }

    public static String truncate(String inputString) {
        String truncatedString = "";
        if (inputString.length() > 5) {
            truncatedString = inputString.substring(0, 5);
        } else {
            truncatedString = inputString;
        }
        return truncatedString;
    }
}
