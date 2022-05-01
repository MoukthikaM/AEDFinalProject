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
public class MerchOrderList {
     ArrayList<OrderItemMerch> merchList;
 
      
    public MerchOrderList() {
        merchList = new ArrayList<OrderItemMerch>();
    }
    
   
    public OrderItemMerch addOrderItemMerch() {
        OrderItemMerch newOrderItemMerch = new OrderItemMerch();
        merchList.add(newOrderItemMerch);
        return newOrderItemMerch;
    }

    public ArrayList<OrderItemMerch> getMerchList() {
        return merchList;
    }

    public void setMerchList(ArrayList<OrderItemMerch> merchList) {
        this.merchList = merchList;
    }

    public void removeOrderItemMerch(OrderItemMerch f) {
        merchList.remove(f);
    }

    public OrderItemMerch findMerch(OrderItemMerch merchorder) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
