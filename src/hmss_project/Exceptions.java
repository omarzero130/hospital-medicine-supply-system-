/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmss_project;
import java.io.Serializable;
import javax.swing.*;
import java.util.*;
/**
 *
 * @author omar rasmy
 */
public class Exceptions extends Exception implements Serializable {
    public Exceptions() {
}
    public Exceptions(String s){
    super(s);
    }
 
  public int checkPhone(String x){
   String phone;
   do{
   phone=JOptionPane.showInputDialog("Enter a valid Number of "+x+".!!");
   if(phone.length()!=10){
       JOptionPane.showMessageDialog(null, "Not valid number of"+x+"Try Again..!!! -.-");
   }
   }while(phone.length()!=10);
   return Integer.parseInt(phone);
   }
  public float checkPrice (float price){
      do {
          price = Float.parseFloat(JOptionPane.showInputDialog("Enter a positive price"+price+"!"));
          if(price <0){
              JOptionPane.showMessageDialog(null, "price is not positive .. please try again");
          }
      }while(price<0);{
      return price;
  }
      
  }
   
}
