/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlinepetstore;

/**
 *
 * @author moukthikamanapati
 */
public class MyPets {
    
    Pet pet;
    User user;

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
     @Override
    public String toString() {
        return pet.getPetName(); 
    }
}
