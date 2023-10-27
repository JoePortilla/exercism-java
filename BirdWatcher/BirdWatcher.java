package BirdWatcher;

public class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return {0,1};

    }

    public int getToday() {
        return 0;
    }

    public void incrementTodaysCount() {
    }

    public boolean hasDayWithoutBirds() {
        return false;

    }

    public int getCountForFirstDays(int numberOfDays) {
        return 0;

    }

    public int getBusyDays() {
        return 0;

    }

    public static void main(String[] args) {
        BirdWatcher watcher = new BirdWatcher(new int[] { 2, 3, 4, 5 });
        System.out.println(watcher.getLastWeek());
    }

}
