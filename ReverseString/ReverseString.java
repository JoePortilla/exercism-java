public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverse("hola"));
    }

    public static String reverse(String inputString) {
        StringBuffer buff = new StringBuffer(inputString);
        buff.reverse();
        return buff.toString();
    }
}
