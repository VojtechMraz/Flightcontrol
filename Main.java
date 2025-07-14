package FlightControl;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        FlightControl flightControl = new FlightControl();
        Scanner scanner = new Scanner(System.in);
        UI ui = new UI(flightControl, scanner);
        //
        ui.start();
    }
}
