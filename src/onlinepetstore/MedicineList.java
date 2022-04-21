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
public class MedicineList {
    
     ArrayList<Medicine> medicineList; 

    public ArrayList<Medicine> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(ArrayList<Medicine> medicineList) {
        this.medicineList = medicineList;
    }

   

  
    
    public MedicineList() {
        medicineList = new ArrayList<Medicine>();
    }
    
   
    public Medicine addMedicine() {
        Medicine newMedicine = new Medicine();
        medicineList.add(newMedicine);
        return newMedicine;
    }

    public void removeMedicine(Medicine f) {
        medicineList.remove(f);
    }
}
