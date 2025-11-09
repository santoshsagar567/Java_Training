import java.time.LocalDateTime;

public class BasicsPrct_22_Flight {

    // Create a Flight class that stores details like flight number, destination, and departure time.
    private String flightNum;
    private String destination;
    private int depTime;
    private LocalDateTime departureTime;

    // Constructor
    public BasicsPrct_22_Flight(String flightNum, String destination, LocalDateTime departureTime) {
        this.flightNum = flightNum;
        this.destination = destination;
        this.departureTime = departureTime;

    }

    // Getter methods
    public String getflightNum() {
        return flightNum;
    }

    public String getdestination() {
        return destination;
    }

    public LocalDateTime getdepTime() {
        return departureTime;
    }

    // Method to display student information
    public void displayFlightDetails() {
        System.out.println("Flight Number: " + this.flightNum);
        System.out.println("Destination: " + this.destination);
        System.out.println("Departure Time: " + this.departureTime);

    }


    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.of(2025, 12, 25, 10, 30);

        BasicsPrct_22_Flight myFlight = new BasicsPrct_22_Flight("AI1682", "London", time);
        myFlight.displayFlightDetails();

    }
}