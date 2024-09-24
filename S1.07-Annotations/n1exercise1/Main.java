package n1exercise1;

public class Main {
    public static void main(String[] args) {
        RemoteWorker remoteWorker = new RemoteWorker("John", "Smith", 20.0);
        OnSiteWorker onSiteWorker = new OnSiteWorker("Jane", "Doe", 21.0);

        int hoursWorked = 168;
        double onlineSalary = remoteWorker.getSalary(hoursWorked);
        double onsiteSalary = onSiteWorker.getSalary(hoursWorked);

        System.out.println("The salary of the remote worker in a month is: " + onlineSalary + "€.");
        System.out.println("The salary of the on-site worker in a month is: " + onsiteSalary + "€.");
    }
}
