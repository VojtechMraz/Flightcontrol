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
public class Flight {
    private Letadlo letadlo;
    private Letiste odkud;
    private Letiste kam;

    public Flight(Letadlo letadlo, Letiste odkud, Letiste kam) {
        this.letadlo = letadlo;
        this.odkud = odkud;
        this.kam = kam;
    }

    public Letadlo getLetadlo() {
        return letadlo;
    }

    public Letiste getOdkud() {
        return odkud;
    }

    public Letiste getKam() {
        return kam;
    }

    public void setLetadlo(Letadlo letadlo) {
        this.letadlo = letadlo;
    }

    public void setOdkud(Letiste odkud) {
        this.odkud = odkud;
    }

    public void setKam(Letiste kam) {
        this.kam = kam;
    }
    
    
}
