package hmss_project;

import java.sql.DriverManager;
import java.sql.Statement;

public class DataBase {
    
    private static Statement stmt = null;
    private static java.sql.Connection conn = null;
    private static  DataBase x ;

    private DataBase() {
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(Exception e)
        {
            System.out.println("unable to connect");
        }
        
    }
    
    public java.sql.Connection connect()
    {  
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (java.sql.Connection) DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/software2","root","");
            System.out.println("connected");
            return conn;
        }
        catch(Exception e)
        {
            System.out.println("unable to connect 2");
            return null;
        }
        
    }
    public static final DataBase getDB (){
        if (x==null){
            x= new DataBase();
        }
            return x ;
        }
    public static void main(String args[])
    {
        DataBase dbconnect = new DataBase();
        dbconnect.connect();
    }
    
    
    
}
