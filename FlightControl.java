/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Vojta
 */
public class FlightControl {
    HashMap<String, Letadlo> letadla = new HashMap<>();;
    HashMap<String, Flight> lety = new HashMap<>();
    Map<String, Letiste> letiste;
    
    public FlightControl(){
        this.letadla = new HashMap<>();
        this.lety = new HashMap<>();
        this.letiste = new HashMap<>();
    }
    
    public void addLetadlo(String ID, int kapacita){
        Letadlo letadlo = new Letadlo(ID,kapacita);
        letadla.put(ID, letadlo);
    }
    
    public void addLet(Letadlo cim, String odkud, String kam){
            letiste.putIfAbsent(odkud, new Letiste(odkud));
    letiste.putIfAbsent(kam, new Letiste(kam));

    Letiste od = letiste.get(odkud);
    Letiste dokam = letiste.get(kam);
        Flight let = new Flight(cim,od,dokam);
        lety.put(cim.getJmeno() + "-" + odkud + "-" + kam, let); 
    }
    
    public void printAirplanes(){
        for (Letadlo letadlo: letadla.values()){
            System.out.println(letadlo.getJmeno() + " (" + letadlo.getKapacita() + " capacity)");
        }
    }
    
    public void printFlights(){
        for (Flight let: lety.values()){
            System.out.println(let.getLetadlo().getJmeno() + " ("+ let.getLetadlo().getKapacita() + " capacity) (" + let.getOdkud().getID() + "-" + let.getKam().getID() + ")");
        }
    }
    
    public void printAirplaneDetails(String id){
            System.out.println(letadla.get(id).getJmeno() + " (" + letadla.get(id).getKapacita() + " capacity)");
    }
}
