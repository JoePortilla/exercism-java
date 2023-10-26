public class CarsAssemble {
    public static void main(String[] args) {
        System.out.println(productionRatePerHour(6));
        System.out.println(workingItemsPerMinute(6));
    }

    public final static double carsPerHour = 221;

    public static double productionRatePerHour(int speed) {
        double rate = 0;
        double successRate = 0;

        if (speed <= 4) {
            successRate = 1;
            rate = speed * carsPerHour * successRate;

        } else if (speed >= 5 && speed <= 8) {
            successRate = 0.9;
            rate = speed * carsPerHour * successRate;

        } else if (speed == 9) {
            successRate = 0.8;
            rate = speed * carsPerHour * successRate;

        } else if (speed == 10) {
            successRate = 0.77;
            rate = speed * carsPerHour * successRate;

        } else {
            rate = 0;
        }
        return rate;

    }

    public static int workingItemsPerMinute(int speed) {
        double hour = productionRatePerHour(speed);
        int items = (int) hour / 60;
        return items;
    }

}
