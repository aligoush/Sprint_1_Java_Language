package n1exercise2;

public class RemoteWorker extends Worker {
    private final double INTERNET_COST = 50.0;
    public RemoteWorker(String name, String surname, double salaryPerHour) {
        super(name, surname, salaryPerHour);
    }
    @Override
    public double getSalary(int hoursWorked) {
        return hoursWorked * salaryPerHour + INTERNET_COST;
    }
    @Deprecated
    public void printMonthlyReport(){
        System.out.println("Printing monthly report...");
    }
}
