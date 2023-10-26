package Darts;

public class Darts {

    public static void main(String[] args) {
        System.out.println(score(7.1, -7.1));
    }

    public static int score(double xOfDart, double yOfDart) {
        int points = 0;
        double radius = Math.sqrt((xOfDart * xOfDart) + (yOfDart * yOfDart));
        // inner
        if (radius <= 1) {
            points = 10;
        }
        // middle
        else if (radius > 1 && radius <= 5) {
            points = 5;
        }
        // outer
        else if (radius > 5 && radius <= 10) {
            points = 1;
        }
        // outside
        else {
            points = 0;
        }

        return points;
    }

}
