package NeedForSpeed;

class NeedForSpeed {
    private int speed = 0;
    private int batteryDrain = 0;
    private int driven = 0;
    private int battery = 100;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        if (battery <= 0) {
            return true;
        } else {
            return false;
        }

    }

    public int distanceDriven() {
        return this.driven;
    }

    public void drive() {
        if (battery > 0) {
            this.driven += speed;
            this.battery -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }

    public static void main(String[] args) {
        int speed = 5;
        int batteryDrain = 2;
        var car = new NeedForSpeed(speed, batteryDrain);

        car.drive();
        System.out.println(car.distanceDriven());
        System.out.println(car.batteryDrained());
        car.drive();
        System.out.println(car.distanceDriven());
        System.out.println(car.batteryDrained());

        var nitroCar = NeedForSpeed.nitro();
        nitroCar.drive();
        System.out.println(nitroCar.distanceDriven());
        System.out.println(nitroCar.batteryDrained());

        int speed2 = 5;
        int batteryDrain2 = 2;
        var car2 = new NeedForSpeed(speed2, batteryDrain2);
        int distance = 100;
        var race = new RaceTrack(distance);

        System.out.println(car2.distanceDriven());
        System.out.println(race.tryFinishTrack(car2));
        System.out.println(car2.distanceDriven());

        System.out.println();
    }
}

class RaceTrack {
    private int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        while ((car.distanceDriven() < distance) && (car.batteryDrained() == false)) {
            car.drive();
        }

        if (car.distanceDriven() >= distance) {
            return true;
        } else {
            return false;
        }
    }
}