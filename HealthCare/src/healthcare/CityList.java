/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author moukthikamanapati
 */
public class CityList  implements Serializable{
    List<String> citynames;

   
    public CityList() {
        citynames = new ArrayList<String>();
    }
//    public List<City> getCitylist() {
//        return city;
//    }

    public List<String> getCitynames() {
        return citynames;
    }

    public void setCitynames(List<String> citynames) {
        this.citynames = citynames;
    }

    public void addCity(String name) {
//        City newcity = new City();
//        newcity.setCityName(name);
//        city.add(newcity);
         citynames.add(name);
       // return newcity;
    }
//    public CityList addCityList() {
//        CityList newCityList = new CityList();
//        return newCityList;
//    }
//  
//    public void setCity(List<City> city) {
//        this.city = city;
//    }
//
//    public void removeEncounter(City s) {
//        city.remove(s);
//    }
    

}
