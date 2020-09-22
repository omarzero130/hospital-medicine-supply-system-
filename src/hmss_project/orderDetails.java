package hmss_project;

public class orderDetails {

    // ---------------------------- ATTRIBUTES -----------------------
    
    private int OrderDetailsID;
    
    private int orderQuantity;

    private String MedicineName;

    private int OrderID;

    private String MedicineType;

    // ---------------------------- CONSTRUCTOR -----------------------
    
    public orderDetails(int OrderDetailsID, int orderQuantity, String MedicineName, int OrderID, String MedicineType) {
        this.OrderDetailsID = OrderDetailsID;
        this.orderQuantity = orderQuantity;
        this.MedicineName = MedicineName;
        this.OrderID = OrderID;
        this.MedicineType = MedicineType;
    }

    public orderDetails(int orderQuantity, String MedicineName, int OrderID, String MedicineType) {
        this.orderQuantity = orderQuantity;
        this.MedicineName = MedicineName;
        this.OrderID = OrderID;
        this.MedicineType = MedicineType;
    }

    public orderDetails(int orderQuantity, String MedicineName, String MedicineType) {
        this.orderQuantity = orderQuantity;
        this.MedicineName = MedicineName;
        this.MedicineType = MedicineType;
    }
    
    public orderDetails() {
    }

   
    
    // ---------------------------- SETTER METHOD -----------------------

    public void setOrderDetailsID(int OrderDetailsID) {
        this.OrderDetailsID = OrderDetailsID;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public void setMedicineName(String MedicineName) {
        this.MedicineName = MedicineName;
    }

    public void setOrderID(int OrderID) {
        this.OrderID = OrderID;
    }

    public void setMedicineType(String MedicineType) {
        this.MedicineType = MedicineType;
    }

    // ---------------------------- GETTER METHOD -----------------------
    
    public int getOrderDetailsID() {
        return OrderDetailsID;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public String getMedicineName() {
        return MedicineName;
    }

    public int getOrderID() {
        return OrderID;
    }

    public String getMedicineType() {
        return MedicineType;
    }

}
