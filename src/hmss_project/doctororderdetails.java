/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmss_project;

/**
 *
 * @author omar shalaby
 */
public class doctororderdetails {
    
    private int order_deatils_ID;
    private int orderID;

    public doctororderdetails(int order_deatils_ID, int orderID, String medicinename, int quantity, String type) {
        this.order_deatils_ID = order_deatils_ID;
        this.orderID = orderID;
        this.medicinename = medicinename;
        this.quantity = quantity;
        this.type = type;
    }
    private String medicinename;
    private int quantity;
        private String type;

    public doctororderdetails(int orderID, String medicinename, int quantity, String type) {
        this.orderID = orderID;
        this.medicinename = medicinename;
        this.quantity = quantity;
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
        


    public doctororderdetails(int order_deatils_ID, int orderID, String medicinename, int quantity) {
        this.order_deatils_ID = order_deatils_ID;
        this.orderID = orderID;
        this.medicinename = medicinename;
        this.quantity = quantity;
    }

    public doctororderdetails(int orderID, String medicinename, int quantity) {
        this.orderID = orderID;
        this.medicinename = medicinename;
        this.quantity = quantity;
    }

    public doctororderdetails() {
    }

    public void setOrder_deatils_ID(int order_deatils_ID) {
        this.order_deatils_ID = order_deatils_ID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public void setMedicinename(String medicinename) {
        this.medicinename = medicinename;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getOrder_deatils_ID() {
        return order_deatils_ID;
    }

    public int getOrderID() {
        return orderID;
    }

    public String getMedicinename() {
        return medicinename;
    }

    public int getQuantity() {
        return quantity;
    }

  
    
}
