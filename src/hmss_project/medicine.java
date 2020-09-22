package hmss_project;


import java.util.Date;

public class medicine {

// ---------------------------- ATTRIBUTES -----------------------

    private int MedicineID;

    private String MedicineName;

    private float MedicinePrice;

    private String MedicineType;

    private String MedicineCompany;

    private int quantity;
    
// ---------------------------- CONSTRUCTOR -----------------------

 public medicine(int MedicineID, String MedicineName, float MedicinePrice, 
            String MedicineType, String MedicineCompany) {
        
        this.MedicineID = MedicineID;
        this.MedicineName = MedicineName;
        this.MedicinePrice = MedicinePrice;
        this.MedicineType = MedicineType;
        this.MedicineCompany = MedicineCompany;
    }

    public medicine(String MedicineName, float MedicinePrice, String MedicineType, String MedicineCompany) {
        this.MedicineName = MedicineName;
        this.MedicinePrice = MedicinePrice;
        this.MedicineType = MedicineType;
        this.MedicineCompany = MedicineCompany;
    }

    public medicine(String MedicineName, float MedicinePrice, String MedicineType, String MedicineCompany, int quantity) {
        this.MedicineName = MedicineName;
        this.MedicinePrice = MedicinePrice;
        this.MedicineType = MedicineType;
        this.MedicineCompany = MedicineCompany;
        this.quantity = quantity;
    }

    
    
 
    public medicine() {
    }

    

    // ---------------------------- SETTER METHOD -----------------------
    
    public void setMedicineID(int MedicineID) {
        this.MedicineID = MedicineID;
    }

    public void setMedicineName(String MedicineName) {
        this.MedicineName = MedicineName;
    }

    public void setMedicinePrice(float MedicinePrice) {
        this.MedicinePrice = MedicinePrice;
    }

    public void setMedicineType(String MedicineType) {
        this.MedicineType = MedicineType;
    }


    public void setMedicineCompany(String MedicineCompany) {
        this.MedicineCompany = MedicineCompany;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    

    // ---------------------------- GETTER METHOD -----------------------
    public int getMedicineID() {
        return MedicineID;
    }

    public String getMedicineName() {
        return MedicineName;
    }

    public float getMedicinePrice() {
        return MedicinePrice;
    }

    public String getMedicineType() {
        return MedicineType;
    }

    public String getMedicineCompany() {
        return MedicineCompany;
    }

    public int getQuantity() {
        return quantity;
    }
    
    
    
}
