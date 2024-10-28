package car;

public class Sonata extends Car {

    public static final int PER_LITER = 10;
    double distance;

    public Sonata(double distance) {
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
        return "Sonata";
    }
}
