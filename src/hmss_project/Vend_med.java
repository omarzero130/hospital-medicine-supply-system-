/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmss_project;

/**
 *
 * @author hassan
 */
public class Vend_med {
    
    int ID , VID , MID , OID ;
    double price;

    public Vend_med(int ID, int VID, int MID, double price) {
        this.ID = ID;
        this.VID = VID;
        this.MID = MID;
        this.price = price;
    }

    public Vend_med(int VID, int MID, double price) {
        this.VID = VID;
        this.MID = MID;
        this.price = price;
    }

    public Vend_med() {
    }

    
    
    
    public void setID(int ID) {
        this.ID = ID;
    }

    public void setVID(int VID) {
        this.VID = VID;
    }

    public void setMID(int MID) {
        this.MID = MID;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setOID(int OID) {
        this.OID = OID;
    }

    
    
    public int getID() {
        return ID;
    }

    public int getVID() {
        return VID;
    }

    public int getMID() {
        return MID;
    }

    public double getPrice() {
        return price;
    }

    public int getOID() {
        return OID;
    }
    
    
    
}
