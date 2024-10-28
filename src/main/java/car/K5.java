package car;

public class K5 extends Car {

    public static final int PER_LITER = 13;
    double distance;

    public K5(double distance) {
        this.distance = distance;
    }

    @Override
    public double getDistancePerLiter() {
        return PER_LITER;
    }

    @Override
    public double getTripDistance() {
        return distance;
    }

    @Override
    public String getName() {
        return "K5";
    }
}
