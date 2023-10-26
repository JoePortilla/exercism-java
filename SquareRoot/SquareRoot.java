package SquareRoot;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(squareRoot(4));
    }

    public static int squareRoot(int radicand) {
        double root = 0;

        root = Math.sqrt(radicand);

        return (int) root;
    }
}
