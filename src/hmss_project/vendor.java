package hmss_project;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class vendor extends person {

    // ---------------------------- ATTRIBUTES -----------------------
    
    private int VendorID;

    private String VendorName;

    private String VendorAdress;

    private int phoneNO;
    
    private static String sql ;
    private static Statement stmt ;
    private static java.sql.Connection conn ;
    private static DataBase db;
    private static ResultSet res;
    
    
    // ---------------------------- CONSTRUCTORS -----------------------
    
    public vendor(int VendorID, String VendorName, String VendorAdress, String PersonUserName, String PersonPassword) {
        super(PersonUserName, PersonPassword);
        this.VendorID = VendorID;
        this.VendorName = VendorName;
        this.VendorAdress = VendorAdress;
    }

    public vendor(String VendorName, String VendorAdress, int phoneNO, String PersonUserName, String PersonPassword) {
        super(PersonUserName, PersonPassword);
        this.VendorName = VendorName;
        this.VendorAdress = VendorAdress;
        this.phoneNO = phoneNO;
    }
    
    public vendor() {
        
        db = DataBase.getDB();
        conn = db.connect();
        
    }
    
    // ---------------------------- SETTER METHODS -----------------------
    
    public void setVendorID(int VendorID) {
        this.VendorID = VendorID;
    }

    public void setVendorName(String VendorName) {
        this.VendorName = VendorName;
    }

    public void setVendorAdress(String VendorAdress) {
        this.VendorAdress = VendorAdress;
    }

    public void setPhoneNO(int phoneNO) {
        this.phoneNO = phoneNO;
    }

    
    
    // ---------------------------- GETTER METHODS -----------------------
    
    public int getVendorID() {
        return VendorID;
    }

    public String getVendorName() {
        return VendorName;
    }

    public String getVendorAdress() {
        return VendorAdress;
    }

    public int getPhoneNO() {
        return phoneNO;
    }
    
    
    
    // ---------------------------- OPERATIONS -----------------------

   
    public void sendAcceptMessage(message msg) throws SQLException
    {
        sql = "insert into message (`MessageNotes`, `OrderStatus`, `OrderEstimatedTime`, `VID`, `OID`) "
                  + "values('"+msg.getMessageNotes()+"',"+msg.isOrderStatus()+
                ","+msg.getOrderEstimatedTime()+","+msg.getVendorID()+","+msg.getOrderID()+")";
          stmt = conn.createStatement();
          int i = stmt.executeUpdate(sql);
          if(i>0)
          {
              System.out.println("ROW INSERTED");
          }
          else
          {
              System.out.println("ROW NOT INSERTED");
          }
    }
    
    
    
  public void updateOrderStatus(int OID,boolean MSatus) throws SQLException{
        
       sql="update `order` set `OrerResponse` = "+MSatus+" where OrderID ='"+OID+"'";
       stmt = conn.createStatement();
       int i = stmt.executeUpdate(sql);
       if(i>0)
          {
              System.out.println("ROW UPDATED");
          }
          else
          {
              System.out.println("ROW NOT UPDATED");
          }
      
  }
  
  public void setTotlaPrice(int OID,float price) throws SQLException{
        
       sql="update `order` set `totalPrice` = "+price+" where OrderID ='"+OID+"'";
       stmt = conn.createStatement();
       int i = stmt.executeUpdate(sql);
       if(i>0)
          {
              System.out.println("ROW price UPDATED");
          }
          else
          {
              System.out.println("ROW NOT UPDATED");
          }
    }
  
  public void Update_Medicine_Price(Vend_med VM) throws SQLException{
        
        sql = "update vend_med set `price` ='"+VM.getPrice()+"' where `OID` ='"+VM.getOID()+"'  and `MID` ='"+VM.getMID()+"' ";
        stmt = conn.createStatement();
        int i = stmt.executeUpdate(sql);
        if(i>0)
        {
            System.out.println("ROW INSERTED");
        }
        else
        {
            System.out.println("ROW NOT INSERTED");
        }
        
    }
    
  public void Delete_Medicine_vend(int OrderID) throws SQLException {
        
            sql = "delete from `vend_med` where OID = "+OrderID+"";
            stmt = conn.createStatement();
            int i = stmt.executeUpdate(sql);
            if(i>0)
            {
                System.out.println("ROW DELETED");
            }
            else
            {
                System.out.println("ROW NOT DELETED");
            }
  }
  
    
    public void sendRejectMessage(message msg) throws SQLException
    {
        sql = "insert into message (`MessageNotes`, `OrderStatus`, `VID`, `OID`) "
                  + "values('"+msg.getMessageNotes()+"',"+msg.isOrderStatus()+
                ","+msg.getVendorID()+","+msg.getOrderID()+")";
          stmt = conn.createStatement();
          int i = stmt.executeUpdate(sql);
          if(i>0)
          {
              System.out.println("ROW INSERTED");
          }
          else
          {
              System.out.println("ROW NOT INSERTED");
          }
    }
    
        public ArrayList<order> ListReceivedOrders(int VendorID) throws SQLException {
        ArrayList<order> all = new ArrayList<>();
        order ord ;
        sql="SELECT * FROM `order` WHERE VID="+VendorID+";";
        stmt=conn.createStatement();
        res= stmt.executeQuery(sql);
        while(res.next()){
            ord = new order();
            ord.setOrderID(res.getInt("OrderID"));
            ord.setVendorID(res.getInt("VID"));
            ord.setOrderQuality(res.getBoolean("OrderQuality"));
            ord.setOrderStatus(res.getBoolean("OrderStatus"));
            ord.setVendorResponse(res.getBoolean("OrerResponse"));
            all.add(ord);
        }
        return all;
    }
        
        
      
    public ArrayList<orderDetails> ListOrderDetails(int ordID) throws SQLException{
        ArrayList<orderDetails> allDD =new ArrayList<>();
        orderDetails orDD ;
        sql="SELECT * FROM `orderdetails` WHERE OID="+ordID+";";
        stmt=conn.createStatement();
        res= stmt.executeQuery(sql);
        while (res.next()){
           orDD =  new orderDetails();
           orDD.setMedicineName(res.getString("medicinename"));
           orDD.setMedicineType(res.getString("medicinetype"));
           orDD.setOrderQuantity(res.getInt("orderquantity"));
           allDD.add(orDD);
        }
       return allDD;
        }

    public String loginVendor(String username) throws SQLException
    {
        sql="SELECT `username` , `password` FROM `vendor` ;";
        stmt=conn.createStatement();
        res= stmt.executeQuery(sql);
        String uname , password = "not found";

        if(res.first())
        {
            do{
                uname = res.getString("username");
                if(uname.equals(username)) {
                    password = res.getString("password");
                    break;
                }
            }while(res.next());
        }
        return password;
    }
    
    public static void main(String args[]) throws ParseException, SQLException
    {
        
        vendor v = new vendor();
        Vend_med VM = new Vend_med();
        VM.setPrice(100);
        VM.setMID(11);
        VM.setOID(12);
        v.Update_Medicine_Price(VM);
        
        
    }
    
     public int tkvID (String username) throws SQLException{
        sql="SELECT `VendorID` FROM `vendor` WHERE username='"+username+"'";
        stmt=conn.createStatement();
        res= stmt.executeQuery(sql);
        res.first();
        int vid = res.getInt("VendorID");
               
        /*sql="INSERT INTO `login`(`VID`) VALUES ([value-2])";
        stmt=conn.createStatement();
        res= stmt.executeQuery(sql);*/
        return vid;
        
    }
    public void addLog (int vid) throws SQLException {
        sql="INSERT INTO `login` (`VID`) VALUES ("+vid+");";
        stmt=conn.createStatement();
        int i= stmt.executeUpdate(sql);
        if(i>0)
        {
            System.out.println("ROW INSERTED");
        }
        else
        {
            System.out.println("ROW NOT INSERTED");
        }
    }
    public int tkvidLog () throws SQLException {
        sql="SELECT `VID` FROM `login`where ID = (SELECT MAX(ID) FROM login )";
        stmt=conn.createStatement();
        res= stmt.executeQuery(sql);
        res.last();
        int LVID = res.getInt("VID");
        return LVID;
    }
    
    public int toMID(String medicineName) throws SQLException
    {
        sql = "select MedicineID from `medicine` where MedicineName = '"+medicineName+"' ";
        stmt = conn.createStatement();
        res = stmt.executeQuery(sql);
        res.first();
        int last = res.getInt("MedicineID");
        return last;
    }
    
    public int toVID(String vendorName) throws SQLException
    {
        sql = "select VendorID from `vendor` where VendorName = '"+vendorName+"' ";
        stmt = conn.createStatement();
        res = stmt.executeQuery(sql);
        res.first();
        int last = res.getInt("VendorID");
        return last;
    }
    
    
      public int sumquan(int Vid) throws SQLException{
        sql="SELECT sum(`orderquantity`) as sumoforderqty, `medicinename` FROM `orderdetails` WHERE `OID`IN ( SELECT `OrderID` FROM `order` where `VID` = '"+Vid+"' AND `OrerResponse` = 1 ) GROUP BY `medicinename` ORDER BY sumoforderqty DESC LIMIT 1";
      stmt=conn.createStatement();
        res= stmt.executeQuery(sql);
        res.last();
        int sum= res.getInt("sumoforderqty");
        return sum;
    }
         public String MedName (int Vid) throws SQLException{
          sql="SELECT sum(`orderquantity`) as sumoforderqty, `medicinename` FROM `orderdetails` WHERE `OID`IN ( SELECT `OrderID` FROM `order` where `VID` = "+Vid+" AND `OrerResponse` = 1 ) GROUP BY `medicinename` ORDER BY sumoforderqty DESC LIMIT 1";
      stmt=conn.createStatement();
        res= stmt.executeQuery(sql);
        res.last();
        String medName= res.getString("medicinename");
        return medName;
       
    }
         
    public String toVName(int vid) throws SQLException
    {
        sql = "select VendorName from `vendor` where VendorID = '"+vid+"' ";
        stmt = conn.createStatement();
        res = stmt.executeQuery(sql);
        res.first();
        String last = res.getString("VendorName");
        return last;
    }
    /*
    
    public Object viewStatistics() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    */
    
}
