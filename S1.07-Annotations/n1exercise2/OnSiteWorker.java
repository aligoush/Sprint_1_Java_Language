package n1exercise2;

public class OnSiteWorker extends Worker {
    private static double fuelCost = 80.0;
    public OnSiteWorker(String name, String surname, double salaryPerHour) {
        super(name, surname, salaryPerHour);
    }
    @Override
    public double getSalary(int hoursWorked) {
        return hoursWorked * salaryPerHour + fuelCost;
    }

    @Deprecated
    public void notifyWeeklyMeetings(){
        System.out.println("Have been notified about this week meeting.");
    }
}
