/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FINALACCESS;

import businesslayerproject.CUSTOMER;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class CustomerAccess {
   
            ArrayList<CUSTOMER> customerList = new ArrayList<CUSTOMER>();
     
     
     
     
       
            
        public  ArrayList<CUSTOMER> CUSTOMER() {
            customerList.add(new CUSTOMER(101, "RAGHU", "KOTAMRAJU", "9818929729"));
            customerList.add(new CUSTOMER(102, "GOWTHAM", "KANIKANTI", "9391473293"));
            customerList.add(new CUSTOMER(103, "DATHA", "HARI", "6305417519"));
            return customerList;
        }
        
        public  ArrayList<CUSTOMER> getAllCustomers() {
            return customerList;
        }

}
