/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package PersonUI;

import healthcare.Patient;
import healthcare.PatientDirectory;
import healthcare.Person;
import healthcare.PersonDirectory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author moukthikamanapati
 */
public class PersonView extends javax.swing.JPanel {

    /**
     * Creates new form PersonView
     */
    JPanel userProcessContainer;
    PersonDirectory personDirectory;
    PatientDirectory patientDirectory;

    PersonView(JPanel userProcessContainer, PersonDirectory personDirectory, PatientDirectory patientDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.personDirectory = personDirectory;
        this.patientDirectory = patientDirectory;
        populateTable();
        populateFilterCombo();
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
        tblperson = new javax.swing.JTable();
        btnupdateperson = new javax.swing.JButton();
        cmbPerson = new javax.swing.JComboBox<>();
        txtsearch = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        tblperson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Age", "House", "community", "City"
            }
        ));
        jScrollPane1.setViewportView(tblperson);

        btnupdateperson.setText("Update");
        btnupdateperson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdatepersonActionPerformed(evt);
            }
        });

        cmbPerson.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnupdateperson, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(cmbPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(294, 294, 294))
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnupdateperson, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 93, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnupdatepersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdatepersonActionPerformed

        int selectedRowIndex = tblperson.getSelectedRow();
        Person p = (Person) tblperson.getValueAt(selectedRowIndex, 0);
        String personName = "";
        int age = 0;
        String cityName = "";
        String communityName = "";
        String HouseNumber = "";

        System.out.println("updating person");

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblperson.getModel();
        personName = String.valueOf(model.getValueAt(selectedRowIndex, 1));

        HouseNumber = String.valueOf(model.getValueAt(selectedRowIndex, 3));
        communityName = String.valueOf(model.getValueAt(selectedRowIndex, 4));
        cityName = String.valueOf(model.getValueAt(selectedRowIndex, 5));

        try {

            age = Integer.parseInt(String.valueOf(model.getValueAt(selectedRowIndex, 2)));

            if (HouseNumber.equals("") || cityName.equals("") || personName.equals("") || communityName.equals("")) {
                JOptionPane.showMessageDialog(null, "Please Enter proper details", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please check if you have entered all the values", "Info", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        p.setAge(age);
        p.setName(personName);
        p.getHouse().setHouseno(HouseNumber);
        p.getHouse().getCommunity().setCommunityName(communityName);
        p.getHouse().getCommunity().getCity().setCityName(cityName);
        populateTable();
        // Update Respective person details
        try {
            patientDirectory.getPatientlist();
            //  patient.getEncounterhistory().getEcounterlist();
        } catch (Exception e) {
            //   JOptionPane.showMessageDialog(this, "There is no patient history for this person");

        }
        System.out.println("patient update");
        int personid = p.getId();
        for (Patient patient : patientDirectory.getPatientlist()) {
            if (patient.getPerson().getId() == personid) {
                patient.setPerson(p);


            }
        }


    }//GEN-LAST:event_btnupdatepersonActionPerformed

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblperson.getModel();
        model.setRowCount(0);
        String filterValue = txtsearch.getText();
        String filtername = (String) cmbPerson.getSelectedItem();

        for (Person p : personDirectory.getPersonlist()) {

            if (filterCheck(filtername, filterValue, p)) {
                Object row[] = new Object[6];
                row[0] = p;
                row[1] = p.getName();
                row[2] = p.getAge();
                row[3] = p.getHouse().getHouseno();
                row[4] = p.getHouse().getCommunity().getCommunityName();
                row[5] = p.getHouse().getCommunity().getCity().getCityName();
                model.addRow(row);
            }

        }
        txtsearch.setText("");


    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRowIndex = tblperson.getSelectedRow();
        Person p = (Person) tblperson.getValueAt(selectedRowIndex, 0);
       if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        personDirectory.removePerson(p);
        populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnupdateperson;
    private javax.swing.JComboBox<String> cmbPerson;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblperson;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) tblperson.getModel();
        model.setRowCount(0);
        System.out.println("testing");
        //  System.out.println(p.getHouse().getCommunity().getCity().getCityName());
        for (Person p : personDirectory.getPersonlist()) {
            System.out.println(p.getHouse().getCommunity().getCity().getCityName());
            Object row[] = new Object[6];
            row[0] = p;
            row[1] = p.getName();
            row[2] = p.getAge();
            row[3] = p.getHouse().getHouseno();
            row[4] = p.getHouse().getCommunity().getCommunityName();
            //  row[5] = "";
            row[5] = p.getHouse().getCommunity().getCity().getCityName();
            model.addRow(row);
        }
    }

    private boolean filterCheck(String filtername, String filterValue, Person p) {
      if (filtername.equalsIgnoreCase("Name") && p.getName().equalsIgnoreCase(filterValue)) {
            return true;
        } else if (filtername.equalsIgnoreCase("Age") && p.getAge() == Integer.parseInt(String.valueOf(filterValue))) {
            return true;
        } else if (filtername.equalsIgnoreCase("House") && p.getHouse().getHouseno().equalsIgnoreCase(filterValue)) {
            return true;
        } else if (filtername.equalsIgnoreCase("community") && p.getHouse().getCommunity().getCommunityName().equalsIgnoreCase(filterValue)) {
            return true;
        } else if (filtername.equalsIgnoreCase("city") && p.getHouse().getCommunity().getCity().getCityName().equalsIgnoreCase(filterValue)) {
            return true;
        }  else {
            return false;
        }


    }
      private void populateFilterCombo() {

        cmbPerson.removeAllItems();
        cmbPerson.addItem("Name");
        cmbPerson.addItem("Age");
        cmbPerson.addItem("House");
        cmbPerson.addItem("community");
        cmbPerson.addItem("city");
        

    }

}
