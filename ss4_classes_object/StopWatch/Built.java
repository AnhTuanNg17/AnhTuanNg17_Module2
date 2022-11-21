package ss4_classes_object.StopWatch;

import java.time.LocalTime;

public class Built {
    private double startTime;
    private double endTime;

    public Built(){

    }

    public Built(double startTime, double endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public double getStartTime() {
        return startTime;
    }

    public double getEndTime() {
        return endTime;
    }
    public void start(){
        startTime = System.currentTimeMillis();
    }
    public  void end(){
        endTime = System.currentTimeMillis();
    }
    public double getElapsedTime(){
       return endTime - startTime;
    }
}
