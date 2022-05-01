/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlinepetstore;

import javax.swing.JPanel;

/**
 *
 * @author moukthikamanapati
 */
public class Appointment {
    Doctor doc;
    Pet pet;

  User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
  

    public Doctor getDoc() {
        return doc;
    }

    public void setDoc(Doctor doc) {
        this.doc = doc;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
     @Override
    public String toString() {
        return user.getUsername(); 
    }
}
