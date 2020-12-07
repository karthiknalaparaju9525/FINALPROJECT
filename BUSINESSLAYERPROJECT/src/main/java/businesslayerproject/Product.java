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
public class Product {
  int ProductID;
  String Descrpition;
  int QuantityOnHand;
  Double Price;

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    public String getDescrpition() {
        return Descrpition;
    }

    public void setDescrpition(String Descrpition) {
        this.Descrpition = Descrpition;
    }

    public int getQuantityOnHand() {
        return QuantityOnHand;
    }

    public void setQuantityOnHand(int QuantityOnHand) {
        this.QuantityOnHand = QuantityOnHand;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double Price) {
        this.Price = Price;
    }

    public Product(int ProductID, String Descrpition, int QuantityOnHand, Double Price) {
        this.ProductID = ProductID;
        this.Descrpition = Descrpition;
        this.QuantityOnHand = QuantityOnHand;
        this.Price = Price;
    }

    @Override
    public String toString() {
        return "Product{ " + "ProductID= " + ProductID + ",Descrpition= " + Descrpition + ", QuantityOnHand= " + QuantityOnHand + ", Price= $ \t" + Price + '}';
    }

  
}
