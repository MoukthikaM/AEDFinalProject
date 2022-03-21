/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare;
import java.io.Serializable;
import java.util.Date;
/**
 *
 * @author moukthikamanapati
 */
public class Encounter implements Serializable{
    
    Date encounterdate;
    VitalSigns vitals;

    public Date getEncounterdate() {
        return encounterdate;
    }

    public void setEncounterdate(Date encounterdate) {
        this.encounterdate = encounterdate;
    }
    public VitalSigns addVitals() {
        VitalSigns vital = new VitalSigns();
        return vital;
    }
    public VitalSigns getVitals() {
        return vitals;
    }

    public void setVitals(VitalSigns vitals) {
        this.vitals = vitals;
    }
    public Encounter(){
        encounterdate=new Date();
    }
     @Override
    public String toString() {
        return encounterdate+"";
}
}
