/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslayerproject;

/**
 *
 * @author HP
 */
public class ORDER {
    int OrderNumber;
    int CustomerID;
    String Date;

    public int getOrderNumber() {
        return OrderNumber;
    }

    public void setOrderNumber(int OrderNumber) {
        this.OrderNumber = OrderNumber;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public ORDER(int OrderNumber, int CustomerID, String Date) {
        this.OrderNumber = OrderNumber;
        this.CustomerID = CustomerID;
        this.Date = Date;
    }

    @Override
    public String toString() {
        return "ORDER{" + "OrderNumber=" + OrderNumber + ", CustomerID=" + CustomerID + ", Date=" + Date + '}';
    }
    
}
