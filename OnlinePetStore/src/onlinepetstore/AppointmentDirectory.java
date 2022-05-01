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
public class AppointmentDirectory {
     ArrayList<Appointment> appointmentList;

    public ArrayList<Appointment> getAppointmentList() {
        return appointmentList;
    }

    public void setAppointmentList(ArrayList<Appointment> pppointmentList) {
        this.appointmentList = pppointmentList;
    }

    
   
 
    public AppointmentDirectory() {
        appointmentList = new ArrayList<Appointment>();
    }
    
   
    public Appointment addAppointment() {
        Appointment newAppointment = new Appointment();
        appointmentList.add(newAppointment);
        return newAppointment;
    }

    public void removeAppointment(Appointment u) {
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
