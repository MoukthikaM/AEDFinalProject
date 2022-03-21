/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare;

import java.util.List;

/**
 *
 * @author moukthikamanapati
 */
public class System {

    PatientDirectory patientDirectory;
    PersonDirectory personDirectory;
    CityList cityList;
    //List<City> newc;

    public System() {
        patientDirectory = new PatientDirectory();
        personDirectory = new PersonDirectory();
        cityList = new CityList();
        
       //   newc = cityList.getCitylist();
        cityList.addCity("Chicago");
        cityList.addCity("Boston");
        cityList.addCity("New York");
        cityList.addCity("Seattle");
        //cityList.setCity(newc);

    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public CityList getCityList() {
        return cityList;
    }

    public void setCityList(CityList cityList) {
        this.cityList = cityList;
    }

//    public List<City> getNewc() {
//        return newc;
//    }
//
//    public void setNewc(List<City> newc) {
//        this.newc = newc;
//    }

}
