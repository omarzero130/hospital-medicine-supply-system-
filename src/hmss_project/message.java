package hmss_project;


import java.util.Date;

public class message {

// ---------------------------- ATTRIBUTES -----------------------
    
    private int MessageID;

    private String MessageNotes;

    private boolean orderStatus;
    
    private int OrderEstimatedTime;

    public int vendorID;
    
    public int orderID;
    
    
// ---------------------------- CONSTRUCTOR -----------------------    

    public message(int MessageID, String MessageNotes, boolean orderStatus, int OrderEstimatedTime, int vendorID, int orderID) {
        this.MessageID = MessageID;
        this.MessageNotes = MessageNotes;
        this.orderStatus = orderStatus;
        this.OrderEstimatedTime = OrderEstimatedTime;
        this.vendorID = vendorID;
        this.orderID = orderID;
    }

    public message(String MessageNotes, boolean orderStatus, int OrderEstimatedTime, int vendorID, int orderID) {
        this.MessageNotes = MessageNotes;
        this.orderStatus = orderStatus;
        this.OrderEstimatedTime = OrderEstimatedTime;
        this.vendorID = vendorID;
        this.orderID = orderID;
    }

    public message() {
    }
    
    

// ---------------------------- SETTER METHOD -----------------------
    
    public void setMessageID(int MessageID) {
        this.MessageID = MessageID;
    }

    public void setMessageNotes(String MessageNotes) {
        this.MessageNotes = MessageNotes;
    }

    public void setOrderStatus(boolean orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setOrderEstimatedTime(int OrderEstimatedTime) {
        this.OrderEstimatedTime = OrderEstimatedTime;
    }

    public void setVendorID(int vendorID) {
        this.vendorID = vendorID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    
    
    
    // ---------------------------- GETTER METHOD -----------------------
    
    public int getMessageID() {
        return MessageID;
    }

    public String getMessageNotes() {
        return MessageNotes;
    }

    public boolean isOrderStatus() {
        return orderStatus;
    }

    public int getOrderEstimatedTime() {
        return OrderEstimatedTime;
    }
       
    public int getVendorID() {
        return vendorID;
    }

    public int getOrderID() {
        return orderID;
    }
    
    
   
}
