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
public class OrderItem { 
    int OrderNumber;
    int LineNumber;
    int ProductID;
    String ProductDescription;
    int Quantity;
    Double price;

    public int getOrderNumber() {
        return OrderNumber;
    }

    public void setOrderNumber(int OrderNumber) {
        this.OrderNumber = OrderNumber;
    }

    public int getLineNumber() {
        return LineNumber;
    }

    public void setLineNumber(int LineNumber) {
        this.LineNumber = LineNumber;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    public String getProductDescription() {
        return ProductDescription;
    }

    public void setProductDescription(String ProductDescription) {
        this.ProductDescription = ProductDescription;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public OrderItem(int OrderNumber, int LineNumber, int ProductID, String ProductDescription, int Quantity, Double price) {
        this.OrderNumber = OrderNumber;
        this.LineNumber = LineNumber;
        this.ProductID = ProductID;
        this.ProductDescription = ProductDescription;
        this.Quantity = Quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrderItem{" + "OrderNumber=" + OrderNumber + ", LineNumber=" + LineNumber + ", ProductID=" + ProductID + ", ProductDescription=" + ProductDescription + ", Quantity=" + Quantity + ", price= $  \t" + price  + '}';
    }
    
}
