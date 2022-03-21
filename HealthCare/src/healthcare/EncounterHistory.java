/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author moukthikamanapati
 */
public class EncounterHistory implements Serializable{
        private List<Encounter> encounter;

    public EncounterHistory() {
        encounter = new ArrayList<Encounter>();
    }
    public List<Encounter> getEcounterlist() {
        return encounter;
    }

    public Encounter addEncounter() {
        Encounter newEncounter = new Encounter();
        encounter.add(newEncounter);
        return newEncounter;
    }

  
    public void setEncounter(List<Encounter> encounter) {
        this.encounter = encounter;
    }

    public void removeEncounter(Encounter s) {
        encounter.remove(s);
    }


}
