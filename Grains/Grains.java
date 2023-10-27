package Grains;

import java.math.BigInteger;

public class Grains {

    public BigInteger grainsOnSquare(int square) throws IllegalArgumentException {
        if (square <= 0 || square > 64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }

        return BigInteger.TWO.pow(square - 1);
    }

    public BigInteger grainsOnBoard() {
        BigInteger totalSum = BigInteger.ZERO;

        for (int i = 1; i <= 64; i++) {
            totalSum = totalSum.add(grainsOnSquare(i));
        }

        return totalSum;
    }

    public static void main(String[] args) {
        Grains grains = new Grains();
        System.out.println(grains.grainsOnSquare(16));
        System.out.println(grains.grainsOnBoard());
    }
}
