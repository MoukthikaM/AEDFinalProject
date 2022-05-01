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
public class ClothingDirectory {
   ArrayList<Clothing> clothingList; 

    public ArrayList<Clothing> getClothingList() {
        
        return clothingList;
    }

    public void setClothingList(ArrayList<Clothing> clothingList) {
        this.clothingList = clothingList;
    }
    
    public ClothingDirectory() {
        clothingList = new ArrayList<Clothing>();
    }
    
   
    public Clothing addClothing() {
        Clothing newClothing = new Clothing();
        clothingList.add(newClothing);
        return newClothing;
    }

    public void removeClothing(Clothing c) {
        clothingList.remove(c);
    }
}
