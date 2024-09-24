package n1exercise1;

public class Worker {
    protected String name;
    protected String surname;
    protected double salaryPerHour;
    public Worker(String name, String surname, double salaryPerHour) {
        this.name = name;
        this.surname = surname;
        this.salaryPerHour = salaryPerHour;
    }

    public double getSalary(int hoursWorked) {
        return hoursWorked * salaryPerHour;
    }
}
