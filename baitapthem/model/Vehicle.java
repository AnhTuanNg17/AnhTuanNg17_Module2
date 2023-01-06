package baitapthem.model;

public abstract class Vehicle {
    private String driverPlate;
    private String manufacturer;
    private int yearManufacturer;
    private String owner;

    public Vehicle() {
    }

    public Vehicle(String driverPlate, String manufacturer, int yearManufacturer, String owner) {
        this.driverPlate = driverPlate;
        this.manufacturer = manufacturer;
        this.yearManufacturer = yearManufacturer;
        this.owner = owner;
    }

    public String getDriverPlate() {
        return driverPlate;
    }

    public void setDriverPlate(String driverPlate) {
        this.driverPlate = driverPlate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYearManufacturer() {
        return yearManufacturer;
    }

    public void setYearManufacturer(int yearManufacturer) {
        this.yearManufacturer = yearManufacturer;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "driverPlate='" + driverPlate + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", yearManufacturer=" + yearManufacturer +
                ", owner='" + owner + '\'' +
                '}';
    }
}
