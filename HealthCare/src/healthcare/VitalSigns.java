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
public class VitalSigns implements Serializable {
    double heartrate;
    int bp;
    double weight;
    int respirationrate;

    public int getRespirationrate() {
        return respirationrate;
    }

    public void setRespirationrate(int respirationrate) {
        this.respirationrate = respirationrate;
    }

    public double getHeartrate() {
        return heartrate;
    }

    public void setHeartrate(double heartrate) {
        this.heartrate = heartrate;
    }

    public int getBp() {
        return bp;
    }

    public void setBp(int bp) {
        this.bp = bp;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    
}
