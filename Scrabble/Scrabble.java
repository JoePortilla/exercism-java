package Scrabble;

public class Scrabble {
    private String word;

    public Scrabble(String word) {
        this.word = word;
    }

    public int getScore() {
        int score = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.toUpperCase().charAt(i);
            int letterScore = getLetterScore(c);
            score += letterScore;
        }
        return score;
    }

    private int getLetterScore(char letter) {
        switch (letter) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'L':
            case 'N':
            case 'R':
            case 'S':
            case 'T':
                return 1;
            case 'D':
            case 'G':
                return 2;
            case 'B':
            case 'C':
            case 'M':
            case 'P':
                return 3;
            case 'F':
            case 'H':
            case 'V':
            case 'W':
            case 'Y':
                return 4;
            case 'K':
                return 5;
            case 'J':
            case 'X':
                return 8;
            case 'Q':
            case 'Z':
                return 10;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scrabble game = new Scrabble("zoo");
        System.out.println(game.getScore());
    }

}
