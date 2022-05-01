/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlinepetstore;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author moukthikamanapati
 */
public class PetDirectory {
   ArrayList<Pet> petList;

    public ArrayList<Pet> getPetlist() {
        return petList;
    }

    public void setPetlist(ArrayList<Pet> petlist) {
        this.petList = petlist;
    }

   
    public PetDirectory() {
        petList = new ArrayList<Pet>();
    }
    
   
    public Pet addPet() {
        Pet newPet = new Pet();
        petList.add(newPet);
        return newPet;
    }

    public void removePerson(Pet p) {
        petList.remove(p);
    }
}