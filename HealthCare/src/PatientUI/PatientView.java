/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package PatientUI;

import healthcare.Patient;
import healthcare.PatientDirectory;
import healthcare.Person;
import healthcare.PersonDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author moukthikamanapati
 */
public class PatientView extends javax.swing.JPanel {

    /**
     * Creates new form PatientView
     */
    JPanel userProcessContainer;
    PersonDirectory personDirectory;
    PatientDirectory patientDirectory;

    PatientView(JPanel userProcessContainer, PersonDirectory personDirectory, PatientDirectory patientDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.personDirectory = personDirectory;
        this.patientDirectory = patientDirectory;
        populateTable();
        populateFilterCombo();
    }

    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) tblpatient.getModel();
        model.setRowCount(0);

        for (Patient p : patientDirectory.getPatientlist()) {
               
        Object row[] = new Object[7];
        row[0] = p;
        row[1] = p.getPerson().getName();
        row[2] = p.getPerson().getAge();
        row[3] = p.getInsuranceNumber();
        row[4] = p.getPerson().getHouse().getHouseno();
        row[5] = p.getPerson().getHouse().getCommunity().getCommunityName();
        row[6] = p.getPerson().getHouse().getCommunity().getCity().getCityName();
 
            model.addRow(row);
        }
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
        tblpatient = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        cmbPatient = new javax.swing.JComboBox<>();
        txtsearch = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        BtnUpdate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtIns = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        tblpatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "PatientID", "PatientName", "Age", "Insurance Number", "HouseNo", "Community", "City"
            }
        ));
        jScrollPane1.setViewportView(tblpatient);

        jButton1.setText("Encounter History Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        cmbPatient.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        BtnUpdate.setText("Update");
        BtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdateActionPerformed(evt);
            }
        });

        jLabel1.setText("Insurance number :");

        txtIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInsActionPerformed(evt);
            }
        });

        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtIns, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIns, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(873, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int selectedrow = tblpatient.getSelectedRow();
        if (selectedrow < 0) {
            JOptionPane.showMessageDialog(this, "please select a Person to add");
            return;
        }

        Patient patient = (Patient) tblpatient.getValueAt(selectedrow, 0);
        EncounterHistoryView Enview = new EncounterHistoryView(userProcessContainer, patient);
        userProcessContainer.add("EncounterHistoryView", Enview);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
      
        int selectedRowIndex = tblpatient.getSelectedRow();
        Patient p = (Patient) tblpatient.getValueAt(selectedRowIndex, 0);
       if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        patientDirectory.removePatient(p);
        populateTable();
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
         DefaultTableModel model = (DefaultTableModel) tblpatient.getModel();
        model.setRowCount(0);
        String filterValue = txtsearch.getText();
        String filtername = (String) cmbPatient.getSelectedItem();

        for (Patient p : patientDirectory.getPatientList()) {

            if (filterCheck(filtername, filterValue, p)) {
                Object row[] = new Object[7];
                row[0] = p;
                row[1] = p.getPerson().getName();
                row[2] = p.getPerson().getAge();
                row[3] = p.getInsuranceNumber();
                row[4] = p.getPerson().getHouse().getHouseno();
                row[5] = p.getPerson().getHouse().getCommunity().getCommunityName();
                row[6] = p.getPerson().getHouse().getCommunity().getCity().getCityName();
                model.addRow(row);
            }

        }
        txtsearch.setText("");
    }//GEN-LAST:event_btnsearchActionPerformed

    private void BtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdateActionPerformed

        int selectedRowIndex = tblpatient.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Patient p = (Patient) tblpatient.getValueAt(selectedRowIndex, 0);
        String ins ="";
        System.out.println("updating patient");

        
        DefaultTableModel model = (DefaultTableModel) tblpatient.getModel();
        ins = txtIns.getText();


        try {
            if (txtIns.equals("") ) {
                JOptionPane.showMessageDialog(null, "Please Enter Insurance  details", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please check if you have entered all the values", "Info", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        p.setInsuranceNumber(ins);
        populateTable();
        // Update Respective person details
//        try {
//            patientDirectory.getPatientlist();
//            //  patient.getEncounterhistory().getEcounterlist();
//        } catch (Exception e) {
//            //   JOptionPane.showMessageDialog(this, "There is no patient history for this person");
//
//        }
        System.out.println("patient update");
       
        
    }//GEN-LAST:event_BtnUpdateActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       populateTable();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnUpdate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnsearch;
    private javax.swing.JComboBox<String> cmbPatient;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblpatient;
    private javax.swing.JTextField txtIns;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables

    private boolean filterCheck(String filtername, String filterValue, Patient p) {
   
          if (filtername.equalsIgnoreCase("Name") && p.getPerson().getName().equalsIgnoreCase(filterValue)) {
            return true;
        } else if (filtername.equalsIgnoreCase("Age") && p.getPerson().getAge() == Integer.parseInt(String.valueOf(filterValue))) {
            return true;
        } else if (filtername.equalsIgnoreCase("House") && p.getPerson().getHouse().getHouseno().equalsIgnoreCase(filterValue)) {
            return true;
        } else if (filtername.equalsIgnoreCase("community") && p.getPerson().getHouse().getCommunity().getCommunityName().equalsIgnoreCase(filterValue)) {
            return true;
        } else if (filtername.equalsIgnoreCase("city") && p.getPerson().getHouse().getCommunity().getCity().getCityName().equalsIgnoreCase(filterValue)) {
            return true;
        }
        else if (filtername.equalsIgnoreCase("Insurance") && p.getInsuranceNumber().equalsIgnoreCase(filterValue)) {
            return true;
        } 
        else {
            return false;
        }
    }
    
    private void populateFilterCombo() {

        cmbPatient.removeAllItems();
        cmbPatient.addItem("Name");
        cmbPatient.addItem("Age");
        cmbPatient.addItem("House");
        cmbPatient.addItem("community");
        cmbPatient.addItem("city");
         cmbPatient.addItem("Insurance");
        

    }
}
