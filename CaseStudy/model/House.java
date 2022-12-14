package CaseStudy.model;

public class House extends Facility{
    private String roomStandar;
    private int numberOfFloor;

    public House(){
    }

    public House(String roomStandar, int numberOfFloor) {
        this.roomStandar = roomStandar;
        this.numberOfFloor = numberOfFloor;
    }

    public House(String serviceName, double area, double cost, int maxPeople, String rentalType, String roomStandar, int numberOfFloor) {
        super(serviceName, area, cost, maxPeople, rentalType);
        this.roomStandar = roomStandar;
        this.numberOfFloor = numberOfFloor;
    }

    public String getRoomStandar() {
        return roomStandar;
    }

    public void setRoomStandar(String roomStandar) {
        this.roomStandar = roomStandar;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        super.toString();
        return "House{" +
                "roomStandar='" + roomStandar + '\'' +
                ", numberOfFloor=" + numberOfFloor +
                '}';
    }
}
