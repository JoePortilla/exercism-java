package ElonsToyCar;

public class ElonsToyCar {
    private int distanceDriven = 0;
    private int batteryPercentage = 100;

    public static ElonsToyCar buy() {
        ElonsToyCar car = new ElonsToyCar();

        return car;
    }

    public String distanceDisplay() {
        return "Driven " + distanceDriven + " meters";
    }

    public String batteryDisplay() {
        if (batteryPercentage != 0) {
            return "Battery at " + batteryPercentage + "%";
        } else {
            return "Battery empty";
        }
    }

    public void drive() {
        if (batteryPercentage != 0) {
            distanceDriven += 20;
            batteryPercentage -= 1;
        }
    }

    public static void main(String[] args) {
        ElonsToyCar car = ElonsToyCar.buy();
        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());
        car.drive();
        car.drive();
        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());
        car.drive();
        car.drive();
        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());
    }
}
