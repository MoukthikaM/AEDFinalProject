/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Adoption;

import UserUI.UserWorkArea;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import onlinepetstore.AdoptionList;
import onlinepetstore.AppointmentDirectory;
import onlinepetstore.DoctorList;
import onlinepetstore.OnlineStore;
import onlinepetstore.Pet;
import onlinepetstore.PetDirectory;
import onlinepetstore.User;

/**
 *
 * @author moukthikamanapati
 */
public class AdoptionWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form AdoptionWorkArea
     */
//    public AdoptionWorkArea() {
//        initComponents();
//    }

    
     JPanel userProcess;

    User user;
   PetDirectory petDirectory;
    AdoptionList adl;
    private OnlineStore os;
    public AdoptionWorkArea(JPanel userProcess, PetDirectory petDirectory, User user, AdoptionList adl) {
         initComponents();
     this.userProcess = userProcess;
        this.user = user;
        this.petDirectory = petDirectory;
        this.adl = adl;
    }

    public AdoptionWorkArea(JPanel userProcess, OnlineStore os,User user) {
       initComponents();
     this.userProcess = userProcess;
     this.os = os;
     this.user = user;
     this.adl = os.getAdl();
     this.petDirectory = os.getPetDirectory();
       
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        register = new javax.swing.JButton();
        givePet = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        back = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(123, 69, 12));

        register.setBackground(new java.awt.Color(255, 255, 204));
        register.setFont(new java.awt.Font("Marker Felt", 0, 24)); // NOI18N
        register.setText("Register for adoption/Foster");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        givePet.setBackground(new java.awt.Color(255, 255, 204));
        givePet.setFont(new java.awt.Font("Marker Felt", 1, 24)); // NOI18N
        givePet.setText("Put your pet for adoption/Foster");
        givePet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                givePetActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 204));
        jButton1.setFont(new java.awt.Font("Marker Felt", 1, 24)); // NOI18N
        jButton1.setText("Status");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(255, 255, 204));
        back.setFont(new java.awt.Font("Marker Felt", 1, 24)); // NOI18N
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(back)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(givePet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(register, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(givePet, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        AdoptionRequest add = new AdoptionRequest(userProcess, os,user );
        userProcess.add("AdoptionRequest", add);
        CardLayout layout = (CardLayout) userProcess.getLayout();
        layout.next(userProcess);
    }//GEN-LAST:event_registerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AdoptionStatus add = new AdoptionStatus(userProcess, os,  user );
        userProcess.add("AdoptionRequest", add);
        CardLayout layout = (CardLayout) userProcess.getLayout();
        layout.next(userProcess);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void givePetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_givePetActionPerformed
     for(Pet p : os.getPetDirectory().getPetlist())
     {
         System.out.println("pet give up   : "+ p.getPetName());
     }
     
        GiveForAdoption givadd = new GiveForAdoption(userProcess, os,  user );
        userProcess.add("AdoptionGive", givadd);
        CardLayout layout = (CardLayout) userProcess.getLayout();
        layout.next(userProcess);
    }//GEN-LAST:event_givePetActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
       UserWorkArea uw = new UserWorkArea(userProcess, os,user);
            userProcess.add("UserWorkArea", uw);
            CardLayout layout = (CardLayout) userProcess.getLayout();
            layout.next(userProcess);
    }//GEN-LAST:event_backActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton givePet;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton register;
    // End of variables declaration//GEN-END:variables
}
