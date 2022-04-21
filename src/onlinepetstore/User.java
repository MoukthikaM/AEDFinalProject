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
public class User {
    String username;
//    String firstname;
//    String lastname;
//    String phone;
    String email;
//    String address;
    String role;
    String password;
  //  ArrayList<Pet> petlist;
   // PetDirectory petDirectory;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

//    public PetDirectory getPetDirectory() {
//        return petDirectory;
//    }
//
//    public void setPetDirectory(PetDirectory petDirectory) {
//        this.petDirectory = petDirectory;
//    }
    public String getUsername() {
        return username;
    }
  public User() {
//        petDirectory = new PetDirectory();
    }
    public void setUsername(String username) {
        this.username = username;
    }

//    public String getFirstname() {
//        return firstname;
//    }
//
//    public void setFirstname(String firstname) {
//        this.firstname = firstname;
//    }
//
//    public String getLastname() {
//        return lastname;
//    }
//
//    public void setLastname(String lastname) {
//        this.lastname = lastname;
//    }

//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
    

//    public ArrayList<Pet> getPet() {
//        return petlist;
//    }
//
//    public void setPet(ArrayList<Pet> pet) {
//        this.petlist = pet;
//    }

//    public Pet searchPet(int petid) {
//        for (Pet pet : petlist) {
//            if (pet.getPetID() == petid) {
//                return pet;
//            }
//        }
//        return null;
//    }
     @Override
    public String toString() {
        return username; 
    }
            
}
