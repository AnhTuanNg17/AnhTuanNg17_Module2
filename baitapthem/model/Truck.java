package baitapthem.model;

public class Truck extends Vehicle{
    private double load;

    public Truck(){
    }

    public Truck(double load) {
        this.load = load;
    }

    public Truck(String driverPlate, String manufacturer, int yearManufacturer, String owner, double load) {
        super(driverPlate, manufacturer, yearManufacturer, owner);
        this.load = load;
    }

    public double getLoad() {
        return load;
    }

    public void setLoad(double load) {
        this.load = load;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "load=" + load +
                '}';
    }
}
