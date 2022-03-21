/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare;

import java.io.Serializable;

/**
 *
 * @author moukthikamanapati
 */
public class Patient implements Serializable{
    int patientID;
    EncounterHistory encounterhistory;
    Person person;
    String InsuranceNumber;

    public String getInsuranceNumber() {
        return InsuranceNumber;
    }

    public void setInsuranceNumber(String InsuranceNumber) {
        this.InsuranceNumber = InsuranceNumber;
    }
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public EncounterHistory getEncounterhistory() {
        return encounterhistory;
    }
    public EncounterHistory addEncounterHistory() {
        EncounterHistory newEncounterHistory = new EncounterHistory();
        return newEncounterHistory;
    }
    public void setEncounterhistory(EncounterHistory encounterhistory) {
        this.encounterhistory = encounterhistory;
    }
     @Override
    public String toString() {
        return patientID+""; 
    }
}
