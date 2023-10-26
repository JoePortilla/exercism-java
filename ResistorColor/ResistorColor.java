package ResistorColor;

import java.util.Arrays;

public class ResistorColor {
    private String[] colors = {
            "black",
            "brown",
            "red",
            "orange",
            "yellow",
            "green",
            "blue",
            "violet",
            "grey",
            "white"
    };

    int colorCode(String color) {
        return Arrays.asList(colors).indexOf(color);
    }

    String[] colors() {
        return colors;
    }
}