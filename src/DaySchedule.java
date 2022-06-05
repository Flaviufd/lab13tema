import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DaySchedule {
    private Days day;
    private List<String> activities;

    public DaySchedule(Days day) {
        this.day = day;
        activities = new ArrayList<>();
    }

    public Days getDay() {
        return day;
    }

    public void addActivity(String activity) {
        this.activities.add(activity);
    }

    public void removeActivity(String activity) {
        this.activities.remove(activity);
    }

    public List<String> getActivities() {
        return Collections.unmodifiableList(activities);
    }

    @Override
    public String toString() {
        return "DaySchedule{" +
                "day=" + day +
                ", activities=" + activities +
                '}';
    }
}
