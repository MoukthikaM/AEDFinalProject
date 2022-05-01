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
public class PricingDirectory {
     ArrayList<Pricing> priceList;

    public ArrayList<Pricing> getPriceList() {
        return priceList;
    }

    public void setPriceList(ArrayList<Pricing> priceList) {
        this.priceList = priceList;
    }
 
    public PricingDirectory() {
        priceList = new ArrayList<Pricing>();
    }
    
   
    public Pricing addPricing() {
        Pricing newPricing = new Pricing();
        priceList.add(newPricing);
        return newPricing;
    }

    public void removePricing(Pricing p) {
        priceList.remove(p);
    }
}
