package hmss_project;


import java.util.Date;

public class order {

// ---------------------------- ATTRIBUTES -----------------------
    private int OrderID;
    
    private int vendorID;

    private boolean OrderQuality;

    private boolean vendorResponse;

    private boolean OrderStatus;
    
    private boolean adminresponse;
    
    private String orderTime;
    
    private float totalPrice;
    
    // ---------------------------- CONSTRUCTOR -----------------------
    
    public order(int OrderID, int vendorID, boolean OrderQuality, boolean vendorResponse, boolean OrderStatus) {
        this.OrderID = OrderID;
        this.vendorID = vendorID;
        this.OrderQuality = OrderQuality;
        this.vendorResponse = vendorResponse;
        this.OrderStatus = OrderStatus;
    }

    public order(int vendorID, boolean OrderQuality, boolean vendorResponse, boolean OrderStatus) {
        this.vendorID = vendorID;
        this.OrderQuality = OrderQuality;
        this.vendorResponse = vendorResponse;
        this.OrderStatus = OrderStatus;
    }

    public order(int vendorID, boolean OrderQuality, boolean vendorResponse, boolean OrderStatus, String orderTime) {
        this.vendorID = vendorID;
        this.OrderQuality = OrderQuality;
        this.vendorResponse = vendorResponse;
        this.OrderStatus = OrderStatus;
        this.orderTime = orderTime;
    }

    public order(int OrderID, int vendorID, boolean OrderQuality, boolean vendorResponse, boolean OrderStatus, String orderTime) {
        this.OrderID = OrderID;
        this.vendorID = vendorID;
        this.OrderQuality = OrderQuality;
        this.vendorResponse = vendorResponse;
        this.OrderStatus = OrderStatus;
        this.orderTime = orderTime;
    }

    public order(int vendorID, boolean OrderQuality, boolean vendorResponse, boolean OrderStatus, boolean adminresponse, String orderTime, float totalPrice) {
        this.vendorID = vendorID;
        this.OrderQuality = OrderQuality;
        this.vendorResponse = vendorResponse;
        this.OrderStatus = OrderStatus;
        this.adminresponse = adminresponse;
        this.orderTime = orderTime;
        this.totalPrice = totalPrice;
    }

    public order(int OrderID, int vendorID, boolean OrderQuality, boolean vendorResponse, boolean OrderStatus, boolean adminresponse, String orderTime, float totalPrice) {
        this.OrderID = OrderID;
        this.vendorID = vendorID;
        this.OrderQuality = OrderQuality;
        this.vendorResponse = vendorResponse;
        this.OrderStatus = OrderStatus;
        this.adminresponse = adminresponse;
        this.orderTime = orderTime;
        this.totalPrice = totalPrice;
    }
    
    
    
    
    public order() {
    }

    // ---------------------------- SETTER METHOD -----------------------
    
    public void setOrderID(int OrderID) {
        this.OrderID = OrderID;
    }

    public void setVendorID(int vendorID) {
        this.vendorID = vendorID;
    }

    public void setOrderQuality(boolean OrderQuality) {
        this.OrderQuality = OrderQuality;
    }

    public void setVendorResponse(boolean vendorResponse) {
        this.vendorResponse = vendorResponse;
    }

    public void setOrderStatus(boolean OrderStatus) {
        this.OrderStatus = OrderStatus;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setAdminresponse(boolean adminresponse) {
        this.adminresponse = adminresponse;
    }

    
    
    // ---------------------------- GETTER METHOD -----------------------
    
    public int getOrderID() {
        return OrderID;
    }

    public int getVendorID() {
        return vendorID;
    }

    public boolean isOrderQuality() {
        return OrderQuality;
    }

    public boolean isVendorResponse() {
        return vendorResponse;
    }

    public boolean isOrderStatus() {
        return OrderStatus;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public boolean isAdminresponse() {
        return adminresponse;
    }
    
    
}
