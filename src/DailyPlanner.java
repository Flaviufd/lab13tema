import java.util.*;

public class DailyPlanner {
    private final List<DaySchedule> dailySchedule;

    public DailyPlanner() {
        this.dailySchedule = new ArrayList<>();
    }

    public void addActivity(Days day, String activity) {
        if (activity == null) {
            throw new NoActivityException();
        }
        boolean dayFound = false;
        for (DaySchedule daySchedule : dailySchedule) {
            if (daySchedule.getDay() == day) {
                daySchedule.addActivity(activity);
                dayFound = true;
            }
        }
        if (!dayFound) {
            DaySchedule daySchedule = new DaySchedule(day);
            daySchedule.addActivity(activity);
            dailySchedule.add(daySchedule);
        }
    }

    public void removeActivity(Days day, String activity) {
        if(activity == null) {
            throw new NoActivityException();
        }
        boolean dayFound = false;
        for (DaySchedule daySchedule : dailySchedule) {
            if (daySchedule.getDay() == day) {
                daySchedule.removeActivity(activity);
                dayFound = true;
            }
        }
        if (!dayFound) {
            DaySchedule daySchedule = new DaySchedule(day);
            daySchedule.removeActivity(activity);
            dailySchedule.remove(daySchedule);
        }
    }

    public List<String> getActivies(Days day) {
        List<String> activities = new ArrayList<>();
        for (DaySchedule daySchedule : dailySchedule) {
            activities.add(String.valueOf(daySchedule.getActivities()));
        }
        return activities;
    }

    public Map<Days, List<String>> endPlanning() throws NoActivityForDayException {
        if (dailySchedule.size() != Days.values().length) {
            throw new NoActivityForDayException();
        }
        Map<Days, List<String>> plan = new HashMap<>();
        for (DaySchedule daySchedule : dailySchedule) {
            plan.put(daySchedule.getDay(), daySchedule.getActivities());
        }
        return plan;
    }

    @Override
    public String toString() {
        return "DailyPlanner{" +
                "dailySchedule=" + dailySchedule +
                '}';
    }
}
