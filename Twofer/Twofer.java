public class Twofer {
    public static void main(String[] args) {
        System.out.println(twofer("Dolly"));
    }

    public static String twofer(String name) {
        String msg = "";
        if (name != null) {
            msg = "One for " + name + ", one for me.";
        } else {
            msg = "One for you, one for me.";
        }
        return msg;
    }
}