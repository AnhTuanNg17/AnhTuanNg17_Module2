package baitapthem.model;

public class Motor extends Vehicle{
    private Double wattage;

    public Motor(){
    }

    public Motor(Double wattage) {
        this.wattage = wattage;
    }

    public Motor(String driverPlate, String manufacturer, int yearManufacturer, String owner, Double wattage) {
        super(driverPlate, manufacturer, yearManufacturer, owner);
        this.wattage = wattage;
    }

    public Double getWattage() {
        return wattage;
    }

    public void setWattage(Double wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "wattage=" + wattage +
                '}';
    }
}
