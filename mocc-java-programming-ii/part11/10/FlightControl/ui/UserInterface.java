package FlightControl.ui;

import FlightControl.domain.Flight;
import FlightControl.domain.Plane;
import FlightControl.logic.FlightControl;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private FlightControl flightControl;

    public UserInterface (FlightControl flightControl,Scanner scanner){
        this.flightControl = flightControl;
        this.scanner = scanner;
    }

    public void Start(){
        System.out.println("Airport Asset Control");
        while (true){
            System.out.println("Choose an action:\n" +
                    "[1] Add an airplane\n" +
                    "[2] Add a flight\n" +
                    "[x] Exit Airport Asset Control");
            System.out.printf(">");
            String input = scanner.nextLine();
            if (input.equals("x")){
                break;
            }
            if (input.equals("1")){
                System.out.printf("Give the airplane id: ");
                String id = scanner.nextLine();
                System.out.printf("Give the airplane capacity: ");
                int capacity = Integer.valueOf(scanner.nextLine());
                flightControl.addPlane(id,capacity);
            }else if (input.equals("2")) {
                System.out.printf("Give the airplane id: ");
                String id = scanner.nextLine();
                System.out.printf("Give the departure airport id: ");
                String dep = scanner.nextLine();
                System.out.printf("Give the target airport id: ");
                String des = scanner.nextLine();
                flightControl.addFlight(flightControl.getPlane(id), dep, des);
            }
        }

        System.out.printf("Flight Control\n");
        while (true){
            System.out.printf("Choose an action:\n" +
                    "[1] Print airplanes\n" +
                    "[2] Print flights\n" +
                    "[3] Print airplane details\n" +
                    "[x] Quit\n");
            System.out.printf(">");
            String input = scanner.nextLine();
            if (input.equals("x")) {
                break;
            }
            if (input.equals("1")) {
                printPlane();
            } else if (input.equals("2")) {
                printFlight();
            } else if (input.equals("3")) {
                printAirplaneDetails();
            }

        }
    }

    public void printPlane(){
        for (Plane i: flightControl.getPlanes()){
            System.out.println(i);
        }
    }

    public void printFlight(){
        for (Flight i: flightControl.getFlights()){
            System.out.println(i);
        }
    }

    private void printAirplaneDetails() {
        System.out.print("Give the airplane id: ");
        Plane plane = askForAirplane();
        System.out.println(plane);
        System.out.println();
    }

    private Plane askForAirplane() {
        Plane airplane = null;
        while (airplane == null) {
            String id = scanner.nextLine();
            airplane = flightControl.getPlane(id);

            if (airplane == null) {
                System.out.println("No airplane with the id " + id + ".");
            }
        }

        return airplane;
    }
}
