package baitapthem.model;

public class Car extends Vehicle {
    private int numberOfSeat;
    private String typeOfCar;

    public Car(){
    }

    public Car(int numberOfSeat, String typeOfCar) {
        this.numberOfSeat = numberOfSeat;
        this.typeOfCar = typeOfCar;
    }

    public Car(String driverPlate, String manufacturer, int yearManufacturer, String owner, int numberOfSeat, String typeOfCar) {
        super(driverPlate, manufacturer, yearManufacturer, owner);
        this.numberOfSeat = numberOfSeat;
        this.typeOfCar = typeOfCar;
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    public String getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfSeat=" + numberOfSeat +
                ", typeOfCar='" + typeOfCar + '\'' +
                '}';
    }
}
