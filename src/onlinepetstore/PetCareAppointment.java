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
public class PetCareAppointment {
    ArrayList<PetCare> appointmentList;

    public ArrayList<PetCare> getAppointmentList() {
        return appointmentList;
    }

    public void setAppointmentList(ArrayList<PetCare> pppointmentList) {
        this.appointmentList = pppointmentList;
    }

    
   
 
    public PetCareAppointment() {
        appointmentList = new ArrayList<PetCare>();
    }
    
   
    public PetCare addPetCare() {
        PetCare newAppointment = new PetCare();
        appointmentList.add(newAppointment);
        return newAppointment;
    }

    public void removePetCare(PetCare u) {
        appointmentList.remove(u);
    }
//     public User searchUser(String username) {
//        for (User user : appointmentList) {
//            if (user.getUsername().equals(username)) {
//                return user;
//            }
//        }
//        return null;
//    }
}
