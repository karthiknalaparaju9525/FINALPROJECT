/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mianclass;

import FINALACCESS.CustomerAccess;
import FINALACCESS.OrderAccess;
import FINALACCESS.OrderItemAccess;
import FINALACCESS.ProductAccess;
import businesslayerproject.CUSTOMER;
import businesslayerproject.ORDER;
import businesslayerproject.OrderItem;
import businesslayerproject.Product;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class main {
    public static void main(String[] args){
   CustomerAccess cda   = new CustomerAccess();
   OrderAccess oda      = new OrderAccess();
   OrderItemAccess oida = new OrderItemAccess();
   ProductAccess   pda  = new ProductAccess();
   
   cda.CUSTOMER();
   oda.ORDERCUSTOMER();
   oida.orderItems();
   pda.products();
   
   
   //read everything from DB
   System.out.println("Reading customers");
       ArrayList<CUSTOMER> customerDA = cda.getAllCustomers();
       for(CUSTOMER dbCustomer : customerDA){
           System.out.println(dbCustomer);
       }
       
   System.out.println("\nReading Orders"); 
       ArrayList<ORDER> orderDA = oda.getAllOrders();
       for(ORDER dbOrder : orderDA){
           System.out.println(dbOrder);
       } 
       
   System.out.println("\nReading Orders Items");
       ArrayList<OrderItem> orderItemDA = oida.getAllOrdersItems();
       for(OrderItem dbOrderItm : orderItemDA){
           System.out.println(dbOrderItm);
       }     
       
   System.out.println("\nReading Products");
       ArrayList<Product> productDA = pda.getAllProducts();
       for(Product dbProduct : productDA){
           System.out.println(dbProduct);
       }     
      
    
   }
}
