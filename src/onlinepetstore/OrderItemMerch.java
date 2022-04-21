package onlinepetstore;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author moukthikamanapati
 */
public class OrderItemMerch {
    
    Merchandise Merch;
      String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

   
      @Override
    public String toString() {
        return Merch.getName(); 
    }

    public Merchandise getMerch() {
        return Merch;
    }

    public void setMerch(Merchandise Merch) {
        this.Merch = Merch;
    }
    
}
