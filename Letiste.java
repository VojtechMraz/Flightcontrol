/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl;

/**
 *
 * @author Vojta
 */
public class Letiste {
    private String ID;
    
    public Letiste(String ID){
        this.ID = ID;
    }

    public String getID(){
        return this.ID;
    }
    
    public void setID(String ID){
        this.ID = ID;
    }
}
