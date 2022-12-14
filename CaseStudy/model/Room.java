package CaseStudy.model;

public class Room extends Facility{
    private String freeService;

    public Room(){
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String serviceName, double area, double cost, int maxPeople, String rentalType, String freeService) {
        super(serviceName, area, cost, maxPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        super.toString();
        return "Room{" +
                "freeService='" + freeService + '\'' +
                '}';
    }
}
