/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FINALACCESS;

import businesslayerproject.Product;
import java.util.ArrayList;

/**
 * 
 * @author HP
 */
public class ProductAccess {
    ArrayList<Product> productList = new ArrayList<Product>();
    
    public  ArrayList<Product> products() {
                
            productList.add(new Product(22,"58 INCHES TV",2,719.14));
            productList.add(new Product(33,"LONG LASTING EARPODS",3,597.27));
            productList.add(new Product(44,"SOCIAL USE LAPTOP",4,2198.0));
            return productList;
        }
    
    public  ArrayList<Product> getAllProducts() {
            return productList;
        }
}
