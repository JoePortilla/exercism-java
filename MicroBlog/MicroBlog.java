public class MicroBlog {

    public String truncate(String inputString) {
        String truncatedString = "";
        if (inputString.length() > 5) {
            truncatedString = inputString.substring(0, inputString.offsetByCodePoints(0, 5));
        } else {
            truncatedString = inputString;
        }
        return truncatedString;
    }

    public static void main(String[] args) {
        MicroBlog blog = new MicroBlog();
        System.out.println(blog.truncate("Transversalidad es una palabra larga"));
    }
}
