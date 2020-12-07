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
public class CUSTOMER {
   int customerID;
   String Firstname;
   String Lastname;
   String Phone;

    CUSTOMER() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
        
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    @Override
    public String toString() {
        return "CUSTOMER{" + "customerID=" + customerID + ", Firstname=" + Firstname + ", Lastname=" + Lastname + ", Phone=" + Phone + '}';
    }

    public CUSTOMER(int customerID, String Firstname, String Lastname, String Phone) {
        this.customerID = customerID;
        this.Firstname = Firstname;
        this.Lastname = Lastname;
        this.Phone = Phone;
    }
   
}
