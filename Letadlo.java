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
public class Letadlo {
    private String Jmeno;
    private int kapacita;
    
    public Letadlo(String name,int kapacita){
        this.Jmeno = name;
        this.kapacita = kapacita;
    }

    public void setJmeno(String Jmeno) {
        this.Jmeno = Jmeno;
    }

    public String getJmeno() {
        return Jmeno;
    }
    
    public int getKapacita(){
        return this.kapacita;
    }
}
