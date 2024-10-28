package car;

public class Avante extends Car {

    public static final int PER_LITER = 15;
    double distance;

    public Avante(double distance) {
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
        return "Avante";
    }
}
