/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package onlinepetstore;

import java.awt.Component;
import java.awt.Graphics;
import java.io.Serializable;
import javax.accessibility.Accessible;
import javax.accessibility.AccessibleContext;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author moukthikamanapati
 */
public class Pet {

   String petName;
   int petID;
   String breed;
   double price;
   int age;
   int lifeExp;
   String petIns;
   String petType;
   String sex;
   String Category;

    public String getCategory() {
        return Category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }
   private transient ImageIcon image;

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

   
    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getPetID() {
        return petID;
    }

    public void setPetID(int petID) {
        this.petID = petID;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLifeExp() {
        return lifeExp;
    }

    public void setLifeExp(int lifeExp) {
        this.lifeExp = lifeExp;
    }

    public String getPetIns() {
        return petIns;
    }

    public void setPetIns(String petIns) {
        this.petIns = petIns;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }
     @Override
    public String toString() {
        return petName; 
    }
}