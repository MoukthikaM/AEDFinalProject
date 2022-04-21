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
public class MerchandiseList {
    ArrayList<Merchandise> merchList; 

    public ArrayList<Merchandise> getmerchandiseList() {
        return merchList;
    }

    public void setmerchandiseList(ArrayList<Merchandise> merchList) {
        this.merchList = merchList;
    }

  
    
    public MerchandiseList() {
        merchList = new ArrayList<Merchandise>();
        
    }
    
   
    public Merchandise addMerchandise() {
        Merchandise newMerchandise = new Merchandise();
        merchList.add(newMerchandise);
        return newMerchandise;
    }

    public void removeMerchandise(Merchandise f) {
        merchList.remove(f);
    }
}
