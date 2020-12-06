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



public class Order {
    int orderNumber;
    int customerID;
    String date;
    public Order(int number,int custid,String date) {
        super();
        this.orderNumber=number;
        this.customerID=custid;
        this.date=date;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }
    public String toString(){
        System.out.println(date);
        return date;
    }
}

