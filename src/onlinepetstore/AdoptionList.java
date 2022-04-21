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
public class AdoptionList {
     ArrayList<Adoption> adoptionList;

   

    
   
 
    public AdoptionList() {
        adoptionList = new ArrayList<Adoption>();
    }

    public ArrayList<Adoption> getAdoptionList() {
        return adoptionList;
    }

    public void setAdoptionList(ArrayList<Adoption> adoptionList) {
        this.adoptionList = adoptionList;
    }
    
   
    public Adoption addAdoption() {
        Adoption newAdoption = new Adoption();
        adoptionList.add(newAdoption);
        return newAdoption;
    }

    public void removeAdoption(Adoption u) {
        adoptionList.remove(u);
    }
}
