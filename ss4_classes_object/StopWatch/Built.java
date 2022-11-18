package ss4_classes_object.StopWatch;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.zip.DataFormatException;

public class Built {
    private LocalTime startTime;
    private LocalTime endTime;

    public Built(LocalTime startTime, LocalTime endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }
    public LocalTime getElapsedTime(){
        
    }

}


