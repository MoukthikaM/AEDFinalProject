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
public class PatientDirectory implements Serializable {
         private List<Patient> PatientList;
static int counter ;

    public static int getCounter() {
        return counter;
    }

    public static void setCounter() {
        counter++;
        PatientDirectory.counter = counter;
    }
    
     public static void setCounter(int c) {
        java.lang.System.out.println(c);
        PatientDirectory.counter = c;
    }
    public PatientDirectory() {
        PatientList = new ArrayList<Patient>();
    }

    public List<Patient> getPatientlist() {
        return PatientList;
    }

    public Patient addPatient() {
       
        Patient newPatient = new Patient();
        PatientList.add(newPatient);
        return newPatient;
    }

    public List<Patient> getPatientList() {
        return PatientList;
    }

    public void setPatientList(List<Patient> PatientList) {
        this.PatientList = PatientList;
    }

    public void removePatient(Patient s) {
        PatientList.remove(s);
    }

//    public Patient searchPatient(int patientid) {
//        for (Patient patient : PatientList) {
//            if (patient.getId()==patientid) {
//                return patient;
//            }
//        }
//        return null;
//    }

    public void setC() {
        
    }
}
