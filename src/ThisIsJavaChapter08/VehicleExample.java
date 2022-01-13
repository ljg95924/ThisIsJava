package ThisIsJavaChapter08;

public class VehicleExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();

        Bus bus = (Bus) vehicle;

        bus.run();
        bus.checkFare();
    }
}
