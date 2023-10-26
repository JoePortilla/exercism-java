package BottleSong;

public class BottleSong {

    public static void main(String[] args) {

        System.out.println(recite(10, 10));
    }

    public static String recite(int startBottles, int takeDown) {
        String verse = "";
        String[] englishNumbers = { "No", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
                "Ten" };

        for (int i = startBottles; i > (startBottles - takeDown); i--) {
            if (i == 1) {
                verse += englishNumbers[i] + " green bottle hanging on the wall,\n";
                verse += englishNumbers[i] + " green bottle hanging on the wall,\n";
            } else {
                verse += englishNumbers[i] + " green bottles hanging on the wall,\n";
                verse += englishNumbers[i] + " green bottles hanging on the wall,\n";
            }

            verse += "And if one green bottle should accidentally fall,\n";

            if (i == 2) {
                verse += "There'll be " + englishNumbers[i - 1].toLowerCase()
                        + " green bottle hanging on the wall.";
            } else {
                verse += "There'll be " + englishNumbers[i - 1].toLowerCase()
                        + " green bottles hanging on the wall.";
            }

            if (i > (startBottles - takeDown) + 1) {
                verse += "\n\n";
            } else {
                verse += "";
            }
        }

        return verse;

    }

}
