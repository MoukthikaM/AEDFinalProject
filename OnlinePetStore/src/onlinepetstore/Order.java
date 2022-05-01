/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlinepetstore;

import onlinepetstore.OrderItemPet;
import java.util.ArrayList;
import onlinepetstore.Pet;

/**
 *
 * @author moukthikamanapati
 */
public class Order {
    ArrayList<OrderItemPet> orderitemList;

    public Order() {
        this.orderitemList = new ArrayList<OrderItemPet>();
    }

    public ArrayList<OrderItemPet> getOderitem() {
        return orderitemList;
    }

    public void setOderitem(ArrayList<OrderItemPet> orderitemList) {
        this.orderitemList = orderitemList;
    }
    
//    public void addNewOrderItem(OrderItemPet pet)
//    {
//        OrderItemPet orderitem = new OrderItemPet();
//        orderitemList.add(orderitem);
//        
//        
//    }
     public OrderItemPet addNewOrderItem() {
         OrderItemPet orderitem = new OrderItemPet();
        orderitemList.add(orderitem);
        return orderitem;
    }
    
    
    public OrderItemPet deleteItem(OrderItemPet item)
    {
      //  OrderItemPet orderitem = new OrderItemPet(product,price,qut);
        this.orderitemList.remove(item);
        return item;
        
    }
    public OrderItemPet findPet(Pet p)
    {
        for(OrderItemPet oi: this.getOderitem()){
            if(oi.getPet().equals(p))
                return oi;
        }
        return null;
    } 
}
