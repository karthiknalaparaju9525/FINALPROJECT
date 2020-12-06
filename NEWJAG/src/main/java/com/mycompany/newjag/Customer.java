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



public class Customer {
    int CustomerID;
    String firstName;
    String lastName;
    String phoneNumber;
    public Customer(int id,String fname,String lname,String phone) {
        super();
        this.CustomerID=id;
        this.firstName=fname;
        this.lastName=lname;
        this.phoneNumber=phone;
    }

    public void setCustomerID(int CustomerID) {
        this.CustomerID = CustomerID;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String toString(){
        System.out.println(firstName+" "+lastName+" "+phoneNumber);
            return firstName;
    }
}
