/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package MerchSupplier;

import UserUI.Merch;
import java.awt.CardLayout;
import javax.swing.JPanel;
import onlinepetstore.ClothingDirectory;
import onlinepetstore.FoodList;
import onlinepetstore.MedicineList;
import onlinepetstore.OnlineStore;
import onlinepetstore.PetDirectory;
import ui.MainJFrame;

/**
 *
 * @author moukthikamanapati
 */
public class MerchWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form MerchWorkArea
     */
   
   JPanel userProcess;
   ClothingDirectory clothingDirectory;
   FoodList foodList;
   MedicineList medList;
    private OnlineStore os;
    public MerchWorkArea(JPanel userProcess,ClothingDirectory clothingDirectory,FoodList foodList, MedicineList medList) {
        initComponents();
        this.userProcess = userProcess;
        this.clothingDirectory = clothingDirectory;
        this.foodList = foodList;
        this.medList = medList;
    }

    public MerchWorkArea(JPanel userprocess, OnlineStore os) {
      
 initComponents();
        this.userProcess = userprocess;
        this.os = os;
        this.medList = os.getMedList();
        this.foodList = os.getFoodList();
        this.clothingDirectory = os.getClothingDirectory();

    }

    

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnClothing = new javax.swing.JButton();
        BtnMedicine = new javax.swing.JButton();
        BtnFood = new javax.swing.JButton();
        BtnAcc = new javax.swing.JButton();
        BtnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(123, 69, 12));

        BtnClothing.setBackground(new java.awt.Color(255, 255, 204));
        BtnClothing.setFont(new java.awt.Font("Marker Felt", 1, 24)); // NOI18N
        BtnClothing.setText("Clothing");
        BtnClothing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClothingActionPerformed(evt);
            }
        });

        BtnMedicine.setBackground(new java.awt.Color(255, 255, 204));
        BtnMedicine.setFont(new java.awt.Font("Marker Felt", 1, 24)); // NOI18N
        BtnMedicine.setText("Medicine");
        BtnMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMedicineActionPerformed(evt);
            }
        });

        BtnFood.setBackground(new java.awt.Color(255, 255, 204));
        BtnFood.setFont(new java.awt.Font("Marker Felt", 1, 24)); // NOI18N
        BtnFood.setText("Food");
        BtnFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFoodActionPerformed(evt);
            }
        });

        BtnAcc.setBackground(new java.awt.Color(255, 255, 204));
        BtnAcc.setFont(new java.awt.Font("Marker Felt", 1, 24)); // NOI18N
        BtnAcc.setText("Accessories");
        BtnAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAccActionPerformed(evt);
            }
        });

        BtnBack.setBackground(new java.awt.Color(255, 255, 204));
        BtnBack.setFont(new java.awt.Font("Marker Felt", 1, 24)); // NOI18N
        BtnBack.setText("LogOut");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnClothing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(BtnAcc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnMedicine, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnFood, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 169, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnBack)
                .addGap(42, 42, 42)
                .addComponent(BtnClothing)
                .addGap(106, 106, 106)
                .addComponent(BtnMedicine)
                .addGap(111, 111, 111)
                .addComponent(BtnFood)
                .addGap(93, 93, 93)
                .addComponent(BtnAcc)
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnClothingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClothingActionPerformed
        Clothingupload cu = new Clothingupload(userProcess,os);
        userProcess.add("ClothingUpload", cu);
        CardLayout layout = (CardLayout) userProcess.getLayout();
        layout.next(userProcess);
    }//GEN-LAST:event_BtnClothingActionPerformed

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
       new MainJFrame(os).setVisible(true);
    }//GEN-LAST:event_BtnBackActionPerformed

    private void BtnFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFoodActionPerformed
        FoodUpload fu = new FoodUpload(userProcess,os);
        userProcess.add("Foodupload", fu);
        CardLayout layout = (CardLayout) userProcess.getLayout();
        layout.next(userProcess);
    }//GEN-LAST:event_BtnFoodActionPerformed

    private void BtnAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAccActionPerformed
//        Accessories acc = new Accessories(userProcess,clothingDirectory,accList);
//        userProcess.add("acc", acc);
//        CardLayout layout = (CardLayout) userProcess.getLayout();
//        layout.next(userProcess);
    }//GEN-LAST:event_BtnAccActionPerformed

    private void BtnMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMedicineActionPerformed
        MedicineUpload mu = new MedicineUpload(userProcess,os);
        userProcess.add("MedicineUpload", mu);
        CardLayout layout = (CardLayout) userProcess.getLayout();
        layout.next(userProcess);
    }//GEN-LAST:event_BtnMedicineActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAcc;
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton BtnClothing;
    private javax.swing.JButton BtnFood;
    private javax.swing.JButton BtnMedicine;
    // End of variables declaration//GEN-END:variables
}
