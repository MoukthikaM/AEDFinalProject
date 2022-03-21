/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare;

import java.io.Serializable;

/**
 *
 * @author moukthikamanapati
 */
public class House implements Serializable{
    
    
    String houseno;
    Community community;

   
    public String getHouseno() {
        return houseno;
    }

    public void setHouseno(String houseno) {
        this.houseno = houseno;
    }
    public Community addCommunity()
    {
        Community newcommunity = new Community();
        return newcommunity;
    }
    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }
    
}
