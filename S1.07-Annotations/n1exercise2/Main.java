package n1exercise2;

public class Main {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        RemoteWorker remoteWorker = new RemoteWorker("John", "Smith", 20.0);
        OnSiteWorker onSiteWorker = new OnSiteWorker("Jane", "Doe", 21.0);

        onSiteWorker.notifyWeeklyMeetings();
        remoteWorker.printMonthlyReport();
    }
}
