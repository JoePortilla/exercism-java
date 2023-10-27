package BirdWatcher;

import java.util.Arrays;

public class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] birdsCount = { 0, 2, 5, 3, 7, 8, 4 };
        return birdsCount;

    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] = birdsPerDay[birdsPerDay.length - 1] + 1;
    }

    public boolean hasDayWithoutBirds() {
        // for each
        for (int count : birdsPerDay) {
            if (count == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;

        if (numberOfDays > birdsPerDay.length) {
            numberOfDays = birdsPerDay.length;
        }

        for (int day = 0; day < numberOfDays; day++) {
            count += birdsPerDay[day];
        }
        return count;

    }

    public int getBusyDays() {
        int count = 0;
        for (int day = 0; day < birdsPerDay.length; day++) {
            if (birdsPerDay[day] >= 5) {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
        BirdWatcher watcher = new BirdWatcher(birdsPerDay);

        System.out.println(Arrays.toString(watcher.getLastWeek()));
        System.out.println(watcher.getToday());
        watcher.incrementTodaysCount();
        System.out.println(watcher.getToday());
        System.out.println(watcher.hasDayWithoutBirds());
        System.out.println(watcher.getCountForFirstDays(20));
        System.out.println(watcher.getBusyDays());
    }

}
