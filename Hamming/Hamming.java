package Hamming;

public class Hamming {

    private String leftStrand;
    private String rightStrand;

    public Hamming(String leftStrand, String rightStrand) throws IllegalArgumentException {
        if (leftStrand.length() == 0 && rightStrand.length() != 0) {
            throw new IllegalArgumentException("left strand must not be empty.");
        } else if (leftStrand.length() != 0 && rightStrand.length() == 0) {
            throw new IllegalArgumentException("right strand must not be empty.");
        } else if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }

    public int getHammingDistance() {
        int distance = 0;
        for (int i = 0; i < leftStrand.length(); i++) {
            if (leftStrand.charAt(i) != rightStrand.charAt(i)) {
                distance++;
            }
        }
        return distance;
    }

    public static void main(String[] args) {
        Hamming gen = new Hamming("CC", "C");
        int hammingDistance = gen.getHammingDistance();
        System.out.println(hammingDistance);
    }
}
