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
public class FoodList {
     ArrayList<Food> foodList; 

    public ArrayList<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(ArrayList<Food> foodList) {
        this.foodList = foodList;
    }

  
    
    public FoodList() {
        foodList = new ArrayList<Food>();
        
    }
    
   
    public Food addFood() {
        Food newFood = new Food();
        foodList.add(newFood);
        return newFood;
    }

    public void removeFood(Food f) {
        foodList.remove(f);
    }
}
