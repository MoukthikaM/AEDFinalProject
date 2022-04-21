/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlinepetstore;

import onlinepetstore.Pet;

/**
 *
 * @author moukthikamanapati
 */
public class OrderItemPet {
    Pet pet;
    String username;

    OrderItemPet() {
      
    
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public OrderItemPet(Pet pet) {
        this.pet = pet;
        
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

   
    
      @Override
    public String toString() {
        return this.pet.toString(); 
    }
}
