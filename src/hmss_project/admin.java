package hmss_project;


import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Date;
import java.util.Scanner;

public class admin extends person{

    // ---------------------------- ATTRIBUTES -----------------------
    
    private int AdminID;
    
    
    private static String sql ;
    private static Statement stmt ;
    private static java.sql.Connection conn ;
    private static DataBase db;
    private static ResultSet res;
    private static vendor v;
    private static message msg;
    private static medicine m;
    private static order o;
    private static orderDetails od;
    private static Scanner s = new Scanner(System.in);
    
    // ---------------------------- CONSTRUCTORS -----------------------
    
    public admin() {
    db= DataBase.getDB();
        
        conn = db.connect();
    }

    public admin(int AdminID, String PersonUserName, String PersonPassword) {
        super(PersonUserName, PersonPassword);
        this.AdminID = AdminID;
    }
    
    // ---------------------------- OPERATIONS -----------------------

        public static void main(String args[]) throws ParseException, SQLException
    {
        admin a = new admin();
        System.out.println(a.getShortageListNum());

    }
    
        
    public void addMedicine(medicine m) {
        
        try
        {
            sql = "insert into medicine (`MedicineName`, `MedicineType`,`MedicineCompany`) "
                    + "values('"+m.getMedicineName()+
                    "','"+m.getMedicineType()+"','"+m.getMedicineCompany()+"')";
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
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    
    public ArrayList<String> listMedicineTypes() throws SQLException
    {
         
            ArrayList<String> list = new ArrayList<>();
            sql = "select * from medicineType";
            stmt = conn.createStatement();
            res = stmt.executeQuery(sql);
            for(res.first();!res.isAfterLast();res.next())
            {
                String MedicineType = res.getString("type");
                list.add(MedicineType);

            }
            return list;
    }
    
    public ArrayList<medicine>  listShortageMedicines() throws SQLException
    {
        
            ArrayList<medicine> list = new ArrayList<>();
            medicine m = new medicine();
            sql = "select * from medicine where quantity <= 10 ";
            stmt = conn.createStatement();
            res = stmt.executeQuery(sql);
            for(res.first();!res.isAfterLast();res.next())
            {
                m.setQuantity(res.getInt("quantity"));
                m.setMedicineName(res.getString("MedicineName"));
                list.add(m);

            }
            return list;
    }
    
    public int getShortageListNum() throws SQLException
    {
        sql = " select count(*) as count from medicine where quantity <= 10 ";
        stmt = conn.createStatement();
        res = stmt.executeQuery(sql);
        res.first();
        return res.getInt("count");
    }
    
    public void updateMedicine(medicine m,String medicinenName) {
        
        try
        {
            sql = "update medicine set MedicineName = '"+m.getMedicineName()+"' , MedicinePrice = '"+m.getMedicinePrice()+"'"
                    + " , MedicineType = '"+m.getMedicineType()+"' , MedicineCompany = '"+m.getMedicineCompany()+"'"
                    + " where MedicineName = '"+medicinenName+"' ";
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
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }

    public medicine searchMedicine(String medicineName) {
     
        try
        {   
            sql = "select * from medicine where MedicineName = '"+medicineName+"'";
            stmt = conn.createStatement();
            res = stmt.executeQuery(sql);
            res.first();
            String MedicineName = res.getString("MedicineName");
            int MedicinePrice = res.getInt("MedicinePrice");
            String MedicineType = res.getString("MedicineType");
            String MedicineCompany = res.getString("MedicineCompany");
            int quantity = res.getInt("quantity");
            m = new medicine(MedicineName,MedicinePrice,MedicineType,MedicineCompany,quantity);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return m;
    }

    public void deleteMedicine(String MedicineName) {

        try{
            sql = "delete from medicine where MedicineName = '"+MedicineName+"'";
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
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public ArrayList<medicine> ListMedicines() {
        
        ArrayList<medicine> all = new ArrayList();
        try
        {   
            sql = " select * from medicine ";
            stmt = conn.createStatement();
            res = stmt.executeQuery(sql);
            for(res.first();!res.isAfterLast();res.next())
            {
                String MedicineName = res.getString("MedicineName");
                int MedicinePrice = res.getInt("MedicinePrice");
                String MedicineType = res.getString("MedicineType");
                String MedicineCompany = res.getString("MedicineCompany");
                int quantity = res.getInt("quantity");
                m = new medicine(MedicineName,MedicinePrice,MedicineType,MedicineCompany,quantity);
                all.add(m);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return all;
    }
    
    public int getRecievedOrdersNum() throws SQLException
    {
        sql = " SELECT count(*) AS count from `order` JOIN `message` on `Orderid`=`OID` where `adminResponse` is null";
        stmt = conn.createStatement();
        res = stmt.executeQuery(sql);
        res.first();
        return res.getInt("count");
    }
    
    public int get_oid() throws SQLException
    {
        
        sql = "select * from `order` ";
        stmt = conn.createStatement();
        res = stmt.executeQuery(sql);
        res.last();
        int last = res.getInt("OrderID");
        return last;
    }
     
     
    public void addOrder(int vid) {
             
        try
        {
            sql = "insert into `order` (`VID`) values('"+vid+"')";
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
        catch(Exception e)
        {
            System.out.println(e);
        }
        
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
    
    public String toVName(int vid) throws SQLException
    {
        sql = "select VendorName from `vendor` where VendorID = '"+vid+"' ";
        stmt = conn.createStatement();
        res = stmt.executeQuery(sql);
        res.first();
        String last = res.getString("VendorName");
        return last;
    }
    
    public void addOrderDetails(orderDetails od) {
     
        try
        {
            sql = "insert into `orderdetails` (`orderquantity`, `medicinename`, `medicinetype`, `OID`) "
                    + "values('"+od.getOrderQuantity()+"','"+od.getMedicineName()+
                    "','"+od.getMedicineType()+"','"+get_oid()+"')";
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
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    
    public void insert_Medicine_vend(Vend_med VM) throws SQLException
        {
            
            sql = "insert into vend_med (`VID`, `MID`,`OID`) "
                  + "values('"+VM.getVID()+"','"+VM.getMID()+
                    "','"+VM.getOID()+"')";
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
    
        
    
    public void Update_Medicine_vend(int MID,int OID) throws SQLException{
        
        sql = "update vend_med set `MID` = '"+MID+"' where OID = '"+OID+"' ";
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
        public void Delete_Medicine_vend(int OrderID) {
        
        try{
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
        catch(Exception e)
        {
            System.out.println(e);
        }
        
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
    
    public void updateOrder(int VID) throws SQLException{
        
        sql = "update order set `VID` = '"+VID+"' where VID = '"+VID+"' ";
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
    
    public void updateOrderDetails(orderDetails od,int OID)throws SQLException{
        
        sql = "update orderdetails set `medicinename` = '"+od.getMedicineName()+"' ,"
                + " `medicinetype` = '"+od.getMedicineType()+"' ,"
                + " `orderquantity` = '"+od.getOrderQuantity()+"' where OID = '"+OID+"' ";
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

    public ArrayList<order> searchOrder(String VendorName) throws SQLException {
          
           
       ArrayList<order> all = new ArrayList<order>();
        order ord ; 
       sql = "select * from `order` where VID = '"+toVID(VendorName)+"'";
            stmt = conn.createStatement();
            res = stmt.executeQuery(sql);
            while(res.next()){
                ord= new order();
                ord.setOrderID(res.getInt("OrderID"));   
                ord.setOrderQuality(res.getBoolean("OrderQuality"));
                ord.setOrderStatus(res.getBoolean("OrderStatus"));
                ord.setVendorResponse(res.getBoolean("OrerResponse"));
                ord.setOrderTime(res.getString("OrderTime"));
                ord.setVendorID(res.getInt("VID"));
                ord.setTotalPrice(res.getFloat("totalPrice"));
                ord.setAdminresponse(res.getBoolean("adminResponse"));
                
                all.add(ord);
            }
            return all;
        
        //throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public order searchOrderByID(int ID) throws SQLException {
        order ord ; 
       sql = "select * from `order` where OrderID = '"+ID+"' ";
            stmt = conn.createStatement();
            res = stmt.executeQuery(sql);
            res.first();
            ord= new order();
            ord.setOrderID(res.getInt("OrderID"));   
            ord.setOrderQuality(res.getBoolean("OrderQuality"));
            ord.setOrderStatus(res.getBoolean("OrderStatus"));
            ord.setVendorResponse(res.getBoolean("OrerResponse"));
            ord.setOrderTime(res.getString("OrderTime"));
            ord.setVendorID(res.getInt("VID"));
            ord.setTotalPrice(res.getFloat("totalPrice"));
            ord.setAdminresponse(res.getBoolean("adminResponse"));
            return ord;
        }

    public int getLastOrderID() throws SQLException
    {
        sql = "select max(OrderID) from `order`";
        stmt = conn.createStatement();
        res = stmt.executeQuery(sql);
        res.last();
        return res.getInt("max(OrderID)");
    }
    
    public void deleteOrder(int OrderID) {
        
        try{
            sql = "delete from `order` where OrderID = "+OrderID+"";
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
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    
    
    
    public ArrayList<order> ListOrders()throws SQLException{
            ArrayList<order> all = new ArrayList<>();
            sql = "select * from `order` ";
            stmt = conn.createStatement();
            res = stmt.executeQuery(sql);
            for(res.first();!res.isAfterLast();res.next())
            {
                boolean OrderQuality = res.getBoolean("OrderQuality");
                boolean OrderStatus = res.getBoolean("OrderStatus");
                boolean OrderResponse = res.getBoolean("OrerResponse");
                boolean AdminResponse = res.getBoolean("adminResponse");
                String OrderTime = res.getString("OrderTime");
                int orderID = res.getInt("OrderID");
                int VID = res.getInt("VID");
                float totalPrice = res.getFloat("totalPrice");
                o = new order(orderID,VID, OrderQuality, OrderResponse, OrderStatus,AdminResponse, OrderTime,totalPrice);
                all.add(o);
            }
            return all;
    }
    
    public ArrayList<orderDetails> listorderdetails(int OID)throws SQLException{
        ArrayList<orderDetails> all=new ArrayList<>();
        sql="select * from `orderdetails` where `OID` = '"+OID+"' ";
        stmt=conn.createStatement();
        res=stmt.executeQuery(sql);
        for(res.first();!res.isAfterLast();res.next()){
            int orderQuantity=res.getInt("orderQuantity");
            String MedicineName=res.getString("MedicineName");
            String MedicineType=res.getString("MedicineType");
            od = new orderDetails(orderQuantity,MedicineName,MedicineType);
         all.add(od);
        }
        return all;
    
    }
    
    public void addVendor(vendor v) {
        try
        {
            sql = "insert into vendor (`VendorName`, `VendorAddress`, `username`,`password`,`phoneNo`) "
                    + "values('"+v.getVendorName()+"','"+v.getVendorAdress()+
                    "','"+v.getPersonUserName()+"','"+v.getPersonPassword()+"','"+v.getPhoneNO()+"')";
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
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
   
    public void updateVendor(vendor v,String vendorName) {
        
        try
        {
            sql = "update vendor set VendorName = '"+v.getVendorName()+"' , VendorAddress = '"+v.getVendorAdress()+"'"
                    + " , username = '"+v.getPersonUserName()+"' , VendorName = '"+v.getPersonPassword()+"' , phoneNo = '"+v.getPhoneNO()+"'" +
                    " where VendorName = '"+vendorName+"' ";
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
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }

    public vendor searchVendor(String VendorName) {
        
        try
        {   
            sql = "select * from vendor where VendorName = '"+VendorName+"'";
            stmt = conn.createStatement();
            res = stmt.executeQuery(sql);
            res.first();
            String name = res.getString("VendorName");
            String adress = res.getString("VendorAddress");
            String uname = res.getString("username");
            String pass = res.getString("password");
            int phoneNO = res.getInt("phoneNo");
            v = new vendor(name,adress,phoneNO,uname,pass);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        return v;
    }

    public void deleteVendor(String VendorName) {
        try{
            sql = "delete from vendor where VendorName = '"+VendorName+"'";
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
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public ArrayList<vendor> ListVendors() {
        ArrayList<vendor> all = new ArrayList();
        try
        {   
            sql = " select * from vendor ";
            stmt = conn.createStatement();
            res = stmt.executeQuery(sql);
            for(res.first();!res.isAfterLast();res.next())
            {
                String name = res.getString("VendorName");
                String adress = res.getString("VendorAddress");
                String uname = res.getString("username");
                String pass = res.getString("password");
                int phoneNO = res.getInt("phoneNo");
                v = new vendor(name,adress,phoneNO,uname,pass);
                all.add(v);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return all;
    }
    
    
    public ArrayList<message> ListMessages() {
        ArrayList<message> all = new ArrayList();
        try
        {   
            sql = " select * from message ";
            stmt = conn.createStatement();
            res = stmt.executeQuery(sql);
            for(res.first();!res.isAfterLast();res.next())
            {
                int ID = res.getInt("MessageID");
                String MessageNotes = res.getString("MessageNotes");
                boolean OrderStatus = res.getBoolean("OrderStatus");
                int OrderEstimatedTime = res.getInt("OrderEstimatedTime");
                int VID = res.getInt("VID");
                int OID = res.getInt("OID");
                msg = new message(ID,MessageNotes, OrderStatus, OrderEstimatedTime , VID, OID);
                all.add(msg);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return all;
    }
    
    public ArrayList<message> ListMessages2() {
        ArrayList<message> all = new ArrayList();
        try
        {   
            sql = " SELECT * from `order` JOIN `message` on `Orderid`=`OID` where `adminResponse` is null  ";
            stmt = conn.createStatement();
            res = stmt.executeQuery(sql);
            for(res.first();!res.isAfterLast();res.next())
            {
                int ID = res.getInt("MessageID");
                String MessageNotes = res.getString("MessageNotes");
                boolean OrderStatus = res.getBoolean("OrderStatus");
                int OrderEstimatedTime = res.getInt("OrderEstimatedTime");
                int VID = res.getInt("VID");
                int OID = res.getInt("OID");
                msg = new message(ID,MessageNotes, OrderStatus, OrderEstimatedTime , VID, OID);
                all.add(msg);
            }
        }
        
        
        
        catch(Exception e)
        {
            System.out.println(e);
        }
        return all;
    }
    
    
    
    public message searchMessage(int ID) throws SQLException
    {
        message all = new message();
          
            sql = "select * from message where OID = '"+ID+"'";
            stmt = conn.createStatement();
            res = stmt.executeQuery(sql);
            res.first();
            String MessageNotes = res.getString("MessageNotes");
            boolean OrderStatus = res.getBoolean("OrderStatus");
            int OrderEstimatedTime = res.getInt("OrderEstimatedTime");
            int VID = res.getInt("VID");
            int OID = res.getInt("OID");
            all = new message(MessageNotes, OrderStatus, OrderEstimatedTime , VID, OID);
            
            return all;

    }
    
    
    public String loginAdmin(String username) throws SQLException
    {
        sql="SELECT `username` , `password` FROM `admin` ;";
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
    
    
    
    public float getMedicinePrice(Vend_med VM) throws SQLException
    {
        sql="SELECT `price` FROM `vend_med` where MID='"+VM.getMID()+"' and VID = '"+VM.getVID()+"' and OID='"+VM.getOID()+"' ;";
        stmt=conn.createStatement();
        res= stmt.executeQuery(sql);
        res.first();
        float price = res.getFloat("price");
        return price;
    }
    
    
    public void  setMedicineQuantity(int n,int MID) throws SQLException
    {
        sql="update `medicine` set `quantity` = "+n+" where MedicineID ='"+MID+"'";
        stmt = conn.createStatement();
        int i = stmt.executeUpdate(sql);
        if(i>0)
          {
              System.out.println("ROW quantity UPDATED");
          }
          else
          {
              System.out.println("ROW NOT UPDATED");
          }
    }
    
     public void setResponse(int OID,boolean MSatus) throws SQLException{
        
       sql="update `order` set `adminResponse` = "+MSatus+" where OrderID ='"+OID+"'";
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
     
      public void setQualityAndDeleveryRes(order OD) throws SQLException{
        
       sql="update `order` set `OrderStatus` = "+OD.isOrderStatus()+" , `OrderQuality` = "+OD.isOrderQuality()+" where OrderID ='"+OD.getOrderID()+"'";
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
     
    
    public void adddocotrOrderDetails(doctororderdetails doc_ord,int ID) {
     
        try
        {
            sql = "insert into `doctororderdetails` (`MedicineName`, `Quantity`,`OID`, `type`) "
                    + "values('"+doc_ord.getMedicinename()+"','"+doc_ord.getQuantity()+"','"+ID+"','"+doc_ord.getType()+"')";
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
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    public int todoc_oid(String doctorName) throws SQLException
    {
        sql = "SELECT ID FROM `doctororder` where doctorname = '"+doctorName+"'";
        stmt = conn.createStatement();
        res = stmt.executeQuery(sql);
        res.first();
        int last = res.getInt("ID");
        return last;
    }
    
    
    public ArrayList<doctoroder> List_doctor_Orders()throws SQLException{
            ArrayList<doctoroder> all = new ArrayList<>();
            doctoroder doc_order;
            sql = "select * from `doctororder`";
            stmt = conn.createStatement();
            res = stmt.executeQuery(sql);
            for(res.first();!res.isAfterLast();res.next())
            {
                String OrderTime = res.getString("OrderTime");
                int orderID = res.getInt("ID");
                String doctor_name = res.getString("doctorname");
                doc_order= new doctoroder(orderID, OrderTime, doctor_name);
                all.add(doc_order);
            }
            return all;
    }
    
     public ArrayList<doctororderdetails> list_doctor_orderdetails(int OID)throws SQLException{
        ArrayList<doctororderdetails> all=new ArrayList<>();
         doctororderdetails doc_order_details ;
        sql="select * from `doctororderdetails` where `OID` = '"+OID+"' ";
        stmt=conn.createStatement();
        res=stmt.executeQuery(sql);
        for(res.first();!res.isAfterLast();res.next()){
            
                  int id=res.getInt("ID");
                 int Oid=res.getInt("OID");
            String MedicineName=res.getString("MedicineName");
            int Quantity =res.getInt("Quantity");
            String Type=res.getString("Type");
            doc_order_details= new doctororderdetails(id, Oid, MedicineName, Quantity, Type);
         all.add(doc_order_details);
        }
        return all;
    
    }
      public void adddocotrOrder(String doctorname) {
             
        try
        {
            sql = "insert into `doctororder` (`doctorname`) values('"+doctorname+"')";
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
        catch(Exception e)
        {
            System.out.println(e);
        }
}
      
       public float viewLowPrice(String mName) throws SQLException {
       
        sql="SELECT VID , MIN(price)  FROM vend_med WHERE MID= (SELECT MedicineID FROM medicine WHERE MedicineName ='"+mName+"')";
        stmt=conn.createStatement();
        res=stmt.executeQuery(sql);

        if(res.next()){
    float mprice = res.getFloat("MIN(price)");

       return mprice;
        }
        return 0;
    }
      public int viewvedid(String mName) throws SQLException {
       
        sql="SELECT VID , MIN(price)  FROM vend_med WHERE MID= (SELECT MedicineID FROM medicine WHERE MedicineName ='"+mName+"')";
        stmt=conn.createStatement();
        res=stmt.executeQuery(sql);

        if(res.next()){
    int id = res.getInt("VID");

       return id;
        }
        return 0;
    }
    
      
     
    /*
    public Object generateReports() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    */
   
   
}
