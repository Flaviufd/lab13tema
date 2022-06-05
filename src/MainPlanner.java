public class MainPlanner {
    public static void main(String[] args) {
        DailyPlanner dailyPlanner = new DailyPlanner();
        dailyPlanner.addActivity(Days.FRIDAY, "dansam");
        dailyPlanner.addActivity(Days.FRIDAY, "fotbal");
        dailyPlanner.addActivity(Days.SATURDAY, "dormim");
        System.out.println(dailyPlanner);

        dailyPlanner.removeActivity(Days.FRIDAY, "fotbal");
        System.out.println(dailyPlanner);

        System.out.println(dailyPlanner.getActivies(Days.FRIDAY));
    }
}
