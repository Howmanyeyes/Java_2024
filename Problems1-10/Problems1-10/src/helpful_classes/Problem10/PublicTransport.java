package helpful_classes.Problem10;

public abstract class PublicTransport implements Transport {
    private String routeNumber;
    private int capacity;

    public PublicTransport(String routeNumber, int capacity) {
        this.routeNumber = routeNumber;
        this.capacity = capacity;
    }

    public String getRouteNumber() {
        return routeNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setRouteNumber(String routeNumber) {
        this.routeNumber = routeNumber;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public abstract String getTransportType();
}
