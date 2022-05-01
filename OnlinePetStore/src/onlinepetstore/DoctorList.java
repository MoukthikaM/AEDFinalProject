/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlinepetstore;

import java.util.ArrayList;

/**
 *
 * @author moukthikamanapati
 */
public class DoctorList {
     ArrayList<Doctor> doctorList;

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }

   
 
    public DoctorList() {
        doctorList = new ArrayList<Doctor>();
    }
    
   
    public Doctor addDoctor() {
        Doctor newDoctor = new Doctor();
        doctorList.add(newDoctor);
        return newDoctor;
    }

    public void removeDoctor(Doctor d) {
        doctorList.remove(d);
    }
}
