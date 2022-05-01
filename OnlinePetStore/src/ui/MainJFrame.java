/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import Admin.AdminPage;
import Adoption.AdoptionManager;
import MerchSupplier.Clothingupload;
import MerchSupplier.FoodUpload;
import MerchSupplier.MedicineUpload;
import MerchSupplier.MerchWorkArea;
import PetCareUI.PricesUpload;
import SupplierUI.SupplierWorkArea;
import UserUI.RegisterUser;
import UserUI.UserWorkArea;
import VetManager.RegisterDoc;
import db4o.DB4OUtil;
import db4o.Email;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import onlinepetstore.AdoptionList;
import onlinepetstore.AppointmentDirectory;
import onlinepetstore.ClothingDirectory;
import onlinepetstore.DoctorList;
import onlinepetstore.FoodList;
import onlinepetstore.MasterOderList;
import onlinepetstore.MedicineList;
import onlinepetstore.MerchOrderList;
import onlinepetstore.MyPets;
import onlinepetstore.MyPetsList;

import onlinepetstore.OnlineStore;
import onlinepetstore.Order;
import onlinepetstore.OrderItemPet;
import onlinepetstore.Pet;
import onlinepetstore.PetCareAppointment;
import onlinepetstore.PetDirectory;
import onlinepetstore.PricingDirectory;
import onlinepetstore.User;
import onlinepetstore.UserDirectory;

/**
 *
 * @author moukthikamanapati
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    OnlineStore os;
    PetDirectory petDirectory;
    Order currentorder;
    ClothingDirectory clothingDirectory;
    PricingDirectory pricingDirectory;
    UserDirectory userDirectory;
    DoctorList doclist;
    AppointmentDirectory apphis;
    AdoptionList adl;
    FoodList foodList;
    MedicineList medList;
    MerchOrderList merchList;
    PetCareAppointment papp;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    MyPetsList mypets;
    private MasterOderList masterList;

    public MainJFrame() {
        initComponents();
        //os = new OnlineStore();
        os = dB4OUtil.retrieveSystem();
        petDirectory = os.getPetDirectory();
        clothingDirectory = os.getClothingDirectory();
        pricingDirectory = os.getPricingDirectory();
        userDirectory = os.getUserDirectory();
        doclist = os.getDoclist();
        apphis = os.getApphis();
        adl = os.getAdl();
        foodList = os.getFoodList();
        medList = os.getMedList();
        merchList = os.getMerchList();
        papp = os.getPapp();
        mypets = os.getMypetList();
        setExtendedState(MAXIMIZED_BOTH);
    }

    public MainJFrame(PetDirectory petDirectory) {
        initComponents();

        this.petDirectory = petDirectory;
        setExtendedState(MAXIMIZED_BOTH);
    }

    public MainJFrame(ClothingDirectory clothingDirectory) {
        initComponents();

        this.clothingDirectory = clothingDirectory;
        setExtendedState(MAXIMIZED_BOTH);
    }

    public MainJFrame(PricingDirectory pricingDirectory, ClothingDirectory clothingDirectory, PetDirectory petDirectory, UserDirectory userDirectory) {
        initComponents();
        this.petDirectory = petDirectory;
        this.clothingDirectory = clothingDirectory;
        this.pricingDirectory = pricingDirectory;
        this.userDirectory = userDirectory;
        setExtendedState(MAXIMIZED_BOTH);
    }

    public MainJFrame(UserDirectory userDirectory) {
        initComponents();

        this.userDirectory = userDirectory;
        setExtendedState(MAXIMIZED_BOTH);
    }

    public MainJFrame(UserDirectory userDirectory, PetDirectory petDirectory, DoctorList doclist) {
        initComponents();
        this.petDirectory = petDirectory;
        this.userDirectory = userDirectory;
        this.doclist = doclist;
        setExtendedState(MAXIMIZED_BOTH);
    }

    public MainJFrame(DoctorList doclist) {
        initComponents();
        this.doclist = doclist;
        setExtendedState(MAXIMIZED_BOTH);
    }

//    public MainJFrame(UserDirectory userDirectory, PetDirectory petDirectory, DoctorList doclist, ClothingDirectory clothingDirectory, PricingDirectory pricingDirectory, FoodList foodList, MedicineList medList, MerchOrderList merchList) {
//
//        initComponents();
//        this.petDirectory = petDirectory;
//        this.userDirectory = userDirectory;
//        this.doclist = doclist;
//        this.clothingDirectory = clothingDirectory;
//        this.foodList = foodList;
//        this.medList = medList;
//        this.merchList = merchList;
//        this.pricingDirectory = pricingDirectory;
//        setExtendedState(MAXIMIZED_BOTH);
//
//    }

//    public MainJFrame(ClothingDirectory clothingDirectory, MedicineList medList, FoodList foodList) {
//        initComponents();
//        this.clothingDirectory = clothingDirectory;
//        this.foodList = foodList;
//        this.medList = medList;
//        setExtendedState(MAXIMIZED_BOTH);
//    }
//
//    public MainJFrame(PricingDirectory pricingDirectory) {
//        initComponents();
//        this.pricingDirectory = pricingDirectory;
//        setExtendedState(MAXIMIZED_BOTH);
//
//    }

    public MainJFrame(OnlineStore os) {
        initComponents();
        this.os = os;
        this.userDirectory = os.getUserDirectory();
        
        mypets = os.getMypetList();
        masterList = os.getMasterList();
        for (MyPets p : mypets.getPetsList()) {
            System.out.println(p.getPet().getPetName());
        }
        setExtendedState(MAXIMIZED_BOTH);

    }

//    public MainJFrame(UserDirectory userDirectory, PetDirectory petDirectory, DoctorList doclist, ClothingDirectory clothingDirectory, PricingDirectory pricingDirectory, FoodList foodList, MedicineList medList, MerchOrderList merchList, OnlineStore os) {
//        initComponents();
//        this.petDirectory = petDirectory;
//        this.userDirectory = userDirectory;
//        this.doclist = doclist;
//        this.clothingDirectory = clothingDirectory;
//        this.foodList = foodList;
//        this.medList = medList;
//        this.merchList = merchList;
//        this.pricingDirectory = pricingDirectory;
//        this.os = os;
//        setExtendedState(MAXIMIZED_BOTH);
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userprocess = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        TxtUserName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BtnLogin = new javax.swing.JButton();
        Btnreg = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        userprocess.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(123, 69, 12));

        jPanel2.setBackground(new java.awt.Color(215, 200, 177));

        TxtUserName.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Marker Felt", 1, 24)); // NOI18N
        jLabel2.setText("Username:");

        BtnLogin.setFont(new java.awt.Font("Marker Felt", 1, 24)); // NOI18N
        BtnLogin.setText("Login");
        BtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLoginActionPerformed(evt);
            }
        });

        Btnreg.setFont(new java.awt.Font("Marker Felt", 1, 24)); // NOI18N
        Btnreg.setText("Signup");
        Btnreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnregActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/WhatsApp Image 2022-05-01 at 3.19.32 AM (1).jpeg"))); // NOI18N

        pass.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        pass.setText("");

        jLabel4.setFont(new java.awt.Font("Marker Felt", 1, 24)); // NOI18N
        jLabel4.setText("Password:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(TxtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Btnreg, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel3)
                .addGap(92, 92, 92)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(36, 36, 36)
                .addComponent(BtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Btnreg, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/pet-shop-white-background_1308-16954.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(371, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(283, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(180, 180, 180))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(232, 232, 232))))
        );

        userprocess.add(jPanel1, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userprocess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userprocess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLoginActionPerformed
     String username = String.valueOf(TxtUserName.getText());
         String password = pass.getText();
if (username.equals("") || password.equals("") ) {
                JOptionPane.showMessageDialog(this, "Please check if you have entered all the values", "Info", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

User user = null;
//        String password = pass.getText();
        if (username.equals("Admin")) {
           
            AdminPage ap = new AdminPage(userprocess, os);

            //   UserWorkArea uw = new UserWorkArea(userprocess, petDirectory, currentorder, clothingDirectory, pricingDirectory, userDirectory, user, doclist, apphis, adl, foodList, medList, merchList,papp);
            userprocess.add("AdminPage", ap);
            CardLayout layout = (CardLayout) userprocess.getLayout();
            layout.next(userprocess);
        } else if (username.equals("supplier")) {
            SupplierWorkArea sw = new SupplierWorkArea(userprocess, os);
//            SupplierWorkArea sw = new SupplierWorkArea(userprocess, petDirectory);
            userprocess.add("SupplierWorkArea", sw);
            CardLayout layout = (CardLayout) userprocess.getLayout();
            layout.next(userprocess);
        } else if (username.equals("food")) {
            FoodUpload food = new FoodUpload(userprocess, os);
//            MerchWorkArea mw = new MerchWorkArea(userprocess, clothingDirectory, foodList, medList);
            userprocess.add("FoodUpload", food);
            CardLayout layout = (CardLayout) userprocess.getLayout();
            layout.next(userprocess);
        }else if (username.equals("clothing")) {
            Clothingupload c = new Clothingupload(userprocess, os);
//            MerchWorkArea mw = new MerchWorkArea(userprocess, clothingDirectory, foodList, medList);
            userprocess.add("MerchWorkArea", c);
            CardLayout layout = (CardLayout) userprocess.getLayout();
            layout.next(userprocess);
        } 
        else if (username.equals("med")) {
            MedicineUpload med = new MedicineUpload(userprocess, os);
//            MerchWorkArea mw = new MerchWorkArea(userprocess, clothingDirectory, foodList, medList);
            userprocess.add("MedicineUpload", med);
            CardLayout layout = (CardLayout) userprocess.getLayout();
            layout.next(userprocess);
        } 
        else if (username.equals("merch")) {
            MerchWorkArea mw = new MerchWorkArea(userprocess, os);
//            MerchWorkArea mw = new MerchWorkArea(userprocess, clothingDirectory, foodList, medList);
            userprocess.add("MerchWorkArea", mw);
            CardLayout layout = (CardLayout) userprocess.getLayout();
            layout.next(userprocess);
        } 
        
        else if (username.equals("petcare")) {
            PricesUpload pu = new PricesUpload(userprocess, os);
            //   PricesUpload pu = new PricesUpload(userprocess, pricingDirectory);
            userprocess.add("PricingUpload", pu);
            CardLayout layout = (CardLayout) userprocess.getLayout();
            layout.next(userprocess);
        } else if (username.equals("vet")) {
            RegisterDoc rd = new RegisterDoc(userprocess, os);
//            RegisterDoc rd = new RegisterDoc(userprocess, doclist, user);
            userprocess.add("RegisterDoc", rd);
            CardLayout layout = (CardLayout) userprocess.getLayout();
            layout.next(userprocess);
        } else if (username.equals("adoption")) {
            AdoptionManager ad = new AdoptionManager(userprocess, os);
//            RegisterDoc rd = new RegisterDoc(userprocess, doclist, user);
            userprocess.add("AdoptionManager", ad);
            CardLayout layout = (CardLayout) userprocess.getLayout();
            layout.next(userprocess);
        } else {
            
            user = userDirectory.searchUser(username);
            System.out.println("pass"+password);
            if(user.getPassword().equalsIgnoreCase(password)){
                
            UserWorkArea uw = new UserWorkArea(userprocess, os, user);
            userprocess.add("UserWorkArea", uw);
            CardLayout layout = (CardLayout) userprocess.getLayout();
            layout.next(userprocess);
        }
            else{
                JOptionPane.showMessageDialog(this, "Username or password is incorrect", "Info", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
    }//GEN-LAST:event_BtnLoginActionPerformed

    private void BtnregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnregActionPerformed
        // RegisterUser ru = new RegisterUser(userprocess, userDirectory, petDirectory, doclist, clothingDirectory,pricingDirectory, foodList, medList, merchList,os);
        RegisterUser ru = new RegisterUser(userprocess, os);
        userprocess.add("RegisterUser", ru);
        CardLayout layout = (CardLayout) userprocess.getLayout();
        layout.next(userprocess);
    }//GEN-LAST:event_BtnregActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        System.out.println("closing window");

        dB4OUtil.storeSystem(os);
//        os.setUserDirectory(userDirectory);
//        os.setPetDirectory(petDirectory);
        os = dB4OUtil.retrieveSystem();
        System.out.println(os.getPetDirectory().getPetlist().size());
        System.out.println(os.getPricingDirectory().getPriceList().size());
        os.setApphis(apphis);

        for (MyPets p : mypets.getPetsList()) {
            System.out.println(p.getUser().getUsername());
        }

        for (MyPets p : os.getMypetList().getPetsList()) {
            System.out.println("hello mypets" + p.getPet().getPetName());
        }
//        for (Order o : masterList.getOrderlist()) {
//           
//            for(OrderItemPet op : o.getOderitem()){
//
//            System.out.println(op.getPet().getPetName());
//            System.out.println(op.getPet().getPrice());
//                
//            }
//           
//        }

    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLogin;
    private javax.swing.JButton Btnreg;
    private javax.swing.JTextField TxtUserName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField pass;
    private javax.swing.JPanel userprocess;
    // End of variables declaration//GEN-END:variables
}
