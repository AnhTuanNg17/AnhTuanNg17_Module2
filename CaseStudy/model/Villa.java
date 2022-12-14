package CaseStudy.model;

public class Villa extends Facility{
    private String roomStandar;
    private int poolArea;
    private int numberOfFloor;

    public Villa(){
    }

    public Villa(String roomStandar, int poolArea, int numberOfFloor) {
        this.roomStandar = roomStandar;
        this.poolArea = poolArea;
        this.numberOfFloor = numberOfFloor;
    }

    public Villa(String serviceName, double area, double cost, int maxPeople, String rentalType, String roomStandar, int poolArea, int numberOfFloor) {
        super(serviceName, area, cost, maxPeople, rentalType);
        this.roomStandar = roomStandar;
        this.poolArea = poolArea;
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        super.toString();
        return "Villa{" +
                "roomStandar='" + roomStandar + '\'' +
                ", poolArea=" + poolArea +
                ", numberOfFloor=" + numberOfFloor +
                '}';
    }
}
