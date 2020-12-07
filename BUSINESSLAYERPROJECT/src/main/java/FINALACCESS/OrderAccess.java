/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FINALACCESS;

import businesslayerproject.ORDER;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class OrderAccess {
     ArrayList<ORDER> ordersList = new ArrayList<ORDER>();
    
     public  ArrayList<ORDER> ORDERCUSTOMER() {
                
            ordersList.add(new ORDER(1,101,"12/09/2020"));
            ordersList.add(new ORDER(2,102,"09/23/2020"));
            ordersList.add(new ORDER(3,103,"11/15/2020"));
            return ordersList;
        }
    
     public  ArrayList<ORDER> getAllOrders() {
            return ordersList;
        }
}
