package helpful_classes.Problem10;

public class Tram extends PublicTransport {
    private boolean isElectric;

    public Tram(String routeNumber, int capacity, boolean isElectric) {
        super(routeNumber, capacity);
        this.isElectric = isElectric;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    @Override
    public void start() {
        System.out.println("Tram " + getRouteNumber() + " is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Tram " + getRouteNumber() + " is stopping.");
    }

    @Override
    public double getMaxSpeed() {
        return 60.0; // Max speed of 60 km/h
    }

    @Override
    public String getTransportType() {
        return "Tram";
    }

    @Override
    public String toString() {
        return "Tram{" +
                "routeNumber='" + getRouteNumber() + '\'' +
                ", capacity=" + getCapacity() +
                ", isElectric=" + isElectric +
                ", maxSpeed=" + getMaxSpeed() +
                '}';
    }
}
