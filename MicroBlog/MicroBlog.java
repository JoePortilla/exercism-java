public class MicroBlog {
    public static void main(String[] args) {
        System.out.println(truncate("Transversalidad es una palabra larga"));
    }

    public static String truncate(String inputString) {
        if (inputString.length() > 5) {
            inputString = inputString.substring(0, 5);
        }
        return inputString;
    }
}
