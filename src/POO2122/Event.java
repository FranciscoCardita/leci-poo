package POO2122;

import java.time.LocalDate;
import java.util.*;

public class Event implements IEvent {

    private LocalDate date;
    private Set<Activity> activityList = new TreeSet<>();

    public Event() {

    }

    @Override
    public Event addActivity(Activity activity) {
        if (activity.getClass().getName().equals("Sport") || activity.getClass().getName().equals("Culture")) {
            // if 
                activityList.add(activity);
        }
        return null;
    }
    @Override
    public LocalDate getDate() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public double totalPrice() {
        int i = 0;
        for (Activity activ : activityList) {
            i += activ.getPrice() * activ.getNumParticipants();
        }
        return i;
    }

}
