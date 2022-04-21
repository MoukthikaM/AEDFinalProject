/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserUI;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import onlinepetstore.AdoptionList;
import onlinepetstore.DoctorList;
import onlinepetstore.MyPets;
import onlinepetstore.MyPetsList;
import onlinepetstore.OnlineStore;
import onlinepetstore.Pet;
import onlinepetstore.PetDirectory;
import onlinepetstore.User;
import onlinepetstore.UserDirectory;

/**
 *
 * @author moukthikamanapati
 */
public class MyPet extends javax.swing.JPanel {

    /**
     * Creates new form MyPet
     */
    JPanel userProcess;
    PetDirectory petDirectory;
    UserDirectory userDirectory;
    User user;
DoctorList doclist;
 AdoptionList adl;
    private OnlineStore os;
    ArrayList<Pet> petList;
    private MyPetsList mypetslist;
    MyPet(JPanel userProcess, PetDirectory petDirectory, UserDirectory userDirectory, User user,DoctorList doclist, AdoptionList adl) {
        initComponents();
        initComponents();
        this.userProcess = userProcess;
        this.petDirectory = petDirectory;
        this.user = user;
        this.userDirectory = userDirectory;
        this.doclist = doclist;
        this.adl = adl;
        populateTable();
        populateCombo();
        
    }

    MyPet(JPanel userProcess, OnlineStore os, User user) {
       initComponents();
        this.userProcess = userProcess;
        this.os = os;
        this.user = user; 
        this.mypetslist = os.getMypetList();
        userDirectory = os.getUserDirectory();
      
        populateTable();
        populateCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        mypet = new javax.swing.JTable();
        update = new javax.swing.JButton();
        del = new javax.swing.JButton();
        cmbpet = new javax.swing.JComboBox<>();
        txtval = new javax.swing.JTextField();
        back = new javax.swing.JButton();

        setBackground(new java.awt.Color(123, 69, 12));

        mypet.setBackground(new java.awt.Color(219, 210, 196));
        mypet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Pet Name", "Breed", "Age", "Sex"
            }
        ));
        mypet.setRowHeight(24);
        jScrollPane1.setViewportView(mypet);

        update.setBackground(new java.awt.Color(255, 255, 204));
        update.setFont(new java.awt.Font("Marker Felt", 1, 18)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        del.setBackground(new java.awt.Color(255, 255, 204));
        del.setFont(new java.awt.Font("Marker Felt", 1, 18)); // NOI18N
        del.setText("Delete");
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });

        cmbpet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtval.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        back.setBackground(new java.awt.Color(255, 255, 204));
        back.setFont(new java.awt.Font("Marker Felt", 1, 18)); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(cmbpet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(txtval, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(del, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(422, 422, 422))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbpet, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(del, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        int row = mypet.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        MyPets p = (MyPets) mypet.getValueAt(row, 0);
      //  pet = user.searchPet(pet.getPetID());
           String filtername = (String) cmbpet.getSelectedItem();  
     String filtervalue = String.valueOf(txtval.getText());
     Pet pet =  p.getPet();
     if(filtername.equals("pet name")){
         pet.setPetName(filtervalue);
     }
     else if(filtername.equals("Type")){
         pet.setPetType(filtervalue);
     }
     else if(filtername.equals("breed")){
         pet.setBreed(filtervalue);
     }
     else if(filtername.equals("sex")){
         pet.setSex(filtervalue);
     }
      else if(filtername.equals("age")){
         pet.setAge(Integer.parseInt(txtval.getText()));
     }
     else if(filtername.equals("price")){
         pet.setPrice(Double.parseDouble(txtval.getText()));
     }
    populateTable();
     
    }//GEN-LAST:event_updateActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
       int row = mypet.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        MyPets p = (MyPets) mypet.getValueAt(row, 0);
        mypetslist.removeMyPets(p);
        populateTable();
    }//GEN-LAST:event_delActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
   //  userDirectory.setUserList(user.setPet(petList)); 
        os.setMypetList(mypetslist);
        UserWorkArea uw = new UserWorkArea(userProcess, os, user);
        userProcess.add("UserWorkArea", uw);
        CardLayout layout = (CardLayout) userProcess.getLayout();
        layout.next(userProcess);
    }//GEN-LAST:event_backActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JComboBox<String> cmbpet;
    private javax.swing.JButton del;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable mypet;
    private javax.swing.JTextField txtval;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
    DefaultTableModel model = (DefaultTableModel) mypet.getModel();
        model.setRowCount(0);
        System.out.println("populate on pet type");
        
        for (MyPets p : mypetslist.getPetsList()) {
           if(p.getUser().getUsername().equals(user.getUsername())){
            Object row[] = new Object[4];
            row[0] = p;
            row[2] = p.getPet().getAge();
            row[1] = p.getPet().getBreed();
            row[3] = p.getPet().getSex();
            model.addRow(row);  
           }
    }
    }
    private void populateCombo() {
        cmbpet.removeAllItems();

        cmbpet.addItem("pet name");
        cmbpet.addItem("age");
        cmbpet.addItem("Type");
        cmbpet.addItem("price");
        cmbpet.addItem("breed");
        cmbpet.addItem("sex");
    }
}