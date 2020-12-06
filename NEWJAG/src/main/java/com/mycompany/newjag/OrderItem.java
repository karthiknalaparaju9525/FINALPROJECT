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


public class OrderItem {
    int orderNumber;
    int lineNumber;
    int productID;
    String productDescription;
    int quantity;
    double price;
    public OrderItem(int orderNum,int lineNum,int prodID,String desc,int qty,double price) {
        super();
        this.orderNumber=orderNum;
        this.lineNumber=lineNum;
        this.productID=prodID;
        this.productDescription=desc;
        this.quantity=qty;
        this.price=price;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getProductID() {
        return productID;
    }

    

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public String toString(){
        System.out.println(productDescription);
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductDescription() {
        return productDescription;
    }
}
