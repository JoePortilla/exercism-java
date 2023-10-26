public class Raindrops {

    public static void main(String[] args) {
        System.out.println(convert(28));
    }

    public static String convert(int number) {
        String raindropSound = "";
        if (number % 3 == 0) {
            raindropSound = raindropSound + "Pling";
        }
        if (number % 5 == 0) {
            raindropSound = raindropSound + "Plang";
        }
        if (number % 7 == 0) {
            raindropSound = raindropSound + "Plong";
        }
        if (raindropSound == "") {
            raindropSound = String.valueOf(number);
        }
        return raindropSound;
    }

}
