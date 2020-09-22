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
public class doctoroder {
    
    private int docorder_id;
    private String time;
    private String doctorname;

   public doctoroder(int docorder_id, String time, String doctorname) {
        this.docorder_id = docorder_id;
        this.time = time;
        this.doctorname = doctorname;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }

    
       // ---------------------------- CONSTRUCTOR -----------------------
    public doctoroder() {
    }

    

    public String getDoctorname() {
        return doctorname;
    }

    
//-------------------------------------setter----------------------------
    public void setId(int id) {
        this.docorder_id = id;
    }

    public void setTime(String time) {
        this.time = time;
    }
//-------------------------------getter----------------------------------------
    public int getId() {
        return docorder_id;
    }

    public String getTime() {
        return time;
    }
    
    
    
}
