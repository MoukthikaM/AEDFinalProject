/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlinepetstore;

import javax.swing.JTable;

/**
 *
 * @author moukthikamanapati
 */
public class OnlineStore {

    PetDirectory petDirectory;
    ClothingDirectory clothingDirectory;
    PricingDirectory pricingDirectory;
    UserDirectory userDirectory;
    DoctorList doclist;
    AppointmentDirectory apphis;
    AdoptionList adl;
    MedicineList medList;
    FoodList foodList;
    MerchOrderList merchList;
    PetCareAppointment papp;
    MasterOderList masterList;
MerchandiseList merchandiseList;
    public MasterOderList getMasterList() {
        return masterList;
    }

    public void setMasterList(MasterOderList masterList) {
        this.masterList = masterList;
    }
MyPetsList mypetList;
    private static OnlineStore business;
    private  Order order;

    public void setOrder(Order order) {
        this.order = order;
    }

    public MyPetsList getMypetList() {
        return mypetList;
    }

    public void setMypetList(MyPetsList mypetList) {
        this.mypetList = mypetList;
    }
 
    public static OnlineStore getInstance() {
        if (business == null) {
            business = new OnlineStore();
            
        }
        return business;
    }
   

    public PetCareAppointment getPapp() {
        return papp;
    }

    public void setPapp(PetCareAppointment papp) {
        this.papp = papp;
    }

    public MerchOrderList getMerchList() {
        return merchList;
    }

    public void setMerchList(MerchOrderList merchList) {
        this.merchList = merchList;
    }

    public MedicineList getMedList() {
        return medList;
    }

    public void setMedList(MedicineList medList) {
        this.medList = medList;
    }

    public FoodList getFoodList() {
        return foodList;
    }

    public void setFoodList(FoodList foodList) {
        this.foodList = foodList;
    }

    public AdoptionList getAdl() {
        return adl;
    }

    public void setAdl(AdoptionList adl) {
        this.adl = adl;
    }

    public AppointmentDirectory getApphis() {
        return apphis;
    }

    public void setApphis(AppointmentDirectory apphis) {
        this.apphis = apphis;
    }

    public DoctorList getDoclist() {
        return doclist;
    }

    public void setDoclist(DoctorList doclist) {
        this.doclist = doclist;
    }

    public UserDirectory getUserDirectory() {
        return userDirectory;
    }

    public void setUserDirectory(UserDirectory userDirectory) {
        this.userDirectory = userDirectory;
    }

    public PricingDirectory getPricingDirectory() {
        return pricingDirectory;
    }

    public void setPricingDirectory(PricingDirectory pricingDirectory) {
        this.pricingDirectory = pricingDirectory;
    }

    public ClothingDirectory getClothingDirectory() {
        return clothingDirectory;
    }

    public void setClothingDirectory(ClothingDirectory clothingDirectory) {
        this.clothingDirectory = clothingDirectory;
    }

    public OnlineStore() {
        petDirectory = new PetDirectory();
        clothingDirectory = new ClothingDirectory();
        pricingDirectory = new PricingDirectory();
        userDirectory = new UserDirectory();
        doclist = new DoctorList();
        apphis = new AppointmentDirectory();
        papp = new PetCareAppointment();
        mypetList = new MyPetsList();
       order = new Order();
       merchList = new MerchOrderList();
       masterList = new MasterOderList();
       merchandiseList = new MerchandiseList();
        
    }

    public MerchandiseList getMerchandiseList() {
        return merchandiseList;
    }

    public void setMerchandiseList(MerchandiseList merchandiseList) {
        this.merchandiseList = merchandiseList;
    }

    public Order getOrder() {
        return order;
    }

    public static OnlineStore getBusiness() {
        return business;
    }

    public static void setBusiness(OnlineStore business) {
        OnlineStore.business = business;
    }

    public PetDirectory getPetDirectory() {
        return petDirectory;
    }

    public void setPetDirectory(PetDirectory petDirectory) {
        this.petDirectory = petDirectory;
    }

//    public void setPapp(JTable papp) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    
}
