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
public class Community implements Serializable{
    
    String communityName;
    City city;

  public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }
    public City addCity()
    {
        City newcity = new City();
        return newcity;
    }
    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
   

    


}
