/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl;

import java.util.Scanner;

/**
 *
 * @author Vojta
 */
public class UI {
    private FlightControl flightControl;
    private Scanner scanner;
    
    public UI(FlightControl flightControl, Scanner scanner){
        this.flightControl = flightControl;
        this.scanner = scanner;
    }
    
    public void start(){
        AssetControl();
        flightZbytek();
    }
    
    public void AssetControl(){
        System.out.println("Airport Asset Control");
        while(true){
            
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");
            
            String odpoved = scanner.nextLine();
            if(odpoved.equals("1")){
                System.out.println("Give the airplane id: ");
                String id = scanner.nextLine();
                System.out.println("Give the airplane capacity: ");
                int kapacita = Integer.valueOf(scanner.nextLine());
                flightControl.addLetadlo(id, kapacita);
            }
            if(odpoved.equals("2")){
                System.out.println("Give the airplane id: ");
                String id = scanner.nextLine();
                System.out.println("Give the departure airport id: ");
                String od = scanner.nextLine();
                System.out.println("Give the target airport id: ");
                String kam = scanner.nextLine();
                flightControl.addLet(flightControl.letadla.get(id), od, kam);
            }
            
            if(odpoved.equals("x")){
                break;
            }
        }
    }
    
    public void flightZbytek(){
        System.out.println("Flight Control");
        while(true){
            
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            
            String odpoved = scanner.nextLine();
            if(odpoved.equals("1")){
                flightControl.printAirplanes();
            }
            
            if(odpoved.equals("2")){
                flightControl.printFlights();
            }
            
            if(odpoved.equals("3")){
                System.out.println("Give the airplane id: ");
                String id = scanner.nextLine();
                flightControl.printAirplaneDetails(id);
            }
            
            if(odpoved.equals("x")){
                break;
            }
        }
    }
}
