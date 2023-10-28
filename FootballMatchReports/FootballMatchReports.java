package FootballMatchReports;

public class FootballMatchReports {

    public String onField(int shirtNum) {
        if (shirtNum <= 0 || shirtNum > 11) {
            throw new IllegalArgumentException(" number outside the range 1-11");
        }
        switch (shirtNum) {
            case 1:
                return "goalie";
            case 2:
                return "left back";
            case 3:
                return "center back";
            case 4:
                return "center back";
            case 5:
                return "right back";
            case 6:
                return "midfielder";
            case 7:
                return "midfielder";
            case 8:
                return "midfielder";
            case 9:
                return "left wing";
            case 10:
                return "striker";
            case 11:
                return "right wing";
            default:
                return "unknown";
        }
    }

    public static void main(String[] args) {
        FootballMatchReports player = new FootballMatchReports();
        System.out.println(player.onField(10));
        System.out.println(player.onField(12));

    }
}
