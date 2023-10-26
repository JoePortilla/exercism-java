package DifferenceOfSquaresCalculator;

public class DifferenceOfSquaresCalculator {

    public static void main(String[] args) {
        System.out.println(computeSquareOfSumTo(10));
        System.out.println(computeSumOfSquaresTo(10));
        System.out.println(computeDifferenceOfSquares(10));

    }

    public static int computeSquareOfSumTo(int input) {
        int squareOfSum = 0;
        int sum = 0;
        for (int i = 0; i <= input; i++) {
            sum += i;
        }
        squareOfSum = sum * sum;
        return (int) squareOfSum;
    }

    public static int computeSumOfSquaresTo(int input) {
        int sumOfSquare = 0;
        for (int i = 0; i <= input; i++) {
            sumOfSquare += i * i;
        }
        return sumOfSquare;
    }

    public static int computeDifferenceOfSquares(int input) {
        int difference = 0;
        difference = computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
        return difference;
    }
}
