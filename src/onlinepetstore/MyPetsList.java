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
public class MyPetsList {
     ArrayList<MyPets> petsList; 

    public ArrayList<MyPets> getPetsList() {
        return petsList;
    }

    public void setPetsList(ArrayList<MyPets> petsList) {
        this.petsList = petsList;
    }

  
    public MyPetsList() {
        petsList = new ArrayList<MyPets>();
    }
    
   
    public MyPets addMyPets() {
        MyPets newMyPets = new MyPets();
        petsList.add(newMyPets);
        return newMyPets;
    }

    public void removeMyPets(MyPets c) {
        petsList.remove(c);
    }
}
