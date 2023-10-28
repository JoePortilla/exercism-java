package ElonsToyCar;

public class ElonsToyCar {
    public static ElonsToyCar buy() {
        ElonsToyCar car = new ElonsToyCar();

        return car;
    }

    public String distanceDisplay() {
        return "Driven" + distanceDriven + " meters";
    }

    public String batteryDisplay() {
        return "Battery at" + batteryPercentage + " %";
    }

    public void drive() {
        distanceDriven += 20;
        batteryPercentage -= 1;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
