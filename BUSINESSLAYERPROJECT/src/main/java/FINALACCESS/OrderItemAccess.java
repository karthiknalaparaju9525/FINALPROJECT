/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FINALACCESS;

import businesslayerproject.OrderItem;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class OrderItemAccess {
  ArrayList<OrderItem> orderItemList = new ArrayList<OrderItem>();
    
     public  ArrayList<OrderItem> orderItems() {
                
            orderItemList.add(new OrderItem(1,1,22124,"SAMSUNG-LED TV",3,359.57));
            orderItemList.add(new OrderItem(2,2,23981,"IPHONE-EARPODS",5,199.09));
            orderItemList.add(new OrderItem(3,3,44789,"DELL LAPTOP",6,549.50));
            return orderItemList;
        }
    
     public  ArrayList<OrderItem> getAllOrdersItems() {
            return orderItemList;  
}
}