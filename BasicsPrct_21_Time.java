public class BasicsPrct_21_Time {

    // Create a class Time with hours, minutes, seconds. Add methods to:
    //Add two time objects.
    //Display time in “hh:mm:ss” format.
    private int hours;
    private int mins;
    private int secs;

    // Constructor
    public BasicsPrct_21_Time(int hours, int mins, int secs) {
        this.hours = hours;
        this.mins = mins;
        this.secs = secs;

    }

    // Getter methods
    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return mins;
    }

    public int getSeconds() {
        return secs;
    }

    // Method to display student information
    public String displayTime() {
        //System.out.println(hours+":"+mins+":"+secs);
        return String.format("%02d:%02d:%02d", hours, mins, secs);

    }

    // Method to add two Time objects
    public BasicsPrct_21_Time add(BasicsPrct_21_Time other) {
        int totalSeconds = this.secs + other.secs;
        int totalMinutes = this.mins + other.mins;
        int totalHours = this.hours + other.hours;

        // Handle overflows
        totalMinutes += totalSeconds / 60;
        totalSeconds %= 60;

        totalHours += totalMinutes / 60;
        totalMinutes %= 60;

        totalHours %= 24; // Time wraps around at 24 hours

        return new BasicsPrct_21_Time(totalHours, totalMinutes, totalSeconds);
    }

    public static void main(String[] args) {
        BasicsPrct_21_Time time1 = new BasicsPrct_21_Time(16, 10, 30);
        BasicsPrct_21_Time time2 = new BasicsPrct_21_Time(2, 17, 33);

        System.out.println("Time 1 - " +time1.displayTime());
        System.out.println("Time 2 - " +time2.displayTime());

        BasicsPrct_21_Time time3 = time1.add(time2);
        System.out.println("Time 3 (Sum) - " +time3.displayTime());

    }
}