/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.newjag;

/**
 *
 * @author HP
 */




public class Product {
    int productID;
    String description;
    int quantityOnHand;
    double price;
    public Product(int id,String desc,int qtyOnHand,double price) {
        super();
        this.productID=id;
        this.description=desc;
        this.quantityOnHand=qtyOnHand;
        this.price=price;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getProductID() {
        return productID;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setQuantityOnHand(int quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    public int getQuantityOnHand() {
        return quantityOnHand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public String toString(){
        System.out.println();
        return description;
    }
}

