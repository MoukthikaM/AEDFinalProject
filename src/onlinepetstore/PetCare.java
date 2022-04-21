/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlinepetstore;

/**
 *
 * @author moukthikamanapati
 */
public class PetCare {

   
    String petname;
    Service service;
String username;
//    public MyPets getMypet() {
//        return mypet;
//    }
//
//    public void setMypet(MyPets mypet) {
//        this.mypet = mypet;
//    }
 @Override
    public String toString() {
        return petname; 
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPetname() {
        return petname;
    }
    
    public void setPetname(String petname) {
        this.petname = petname;
    }

    
    
    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    

    
    
    
}
