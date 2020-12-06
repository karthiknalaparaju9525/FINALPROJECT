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

 


import java.util.ArrayList;


public class Repository {
    ArrayList<Product> product=new ArrayList<Product>();
    ArrayList<Order> orders=new ArrayList<Order>();
    ArrayList<Customer> customer=new ArrayList<Customer>();
    ArrayList<OrderItem> orderitem=new ArrayList<OrderItem>();
   
    public Repository() {
        super();
    }
   void create(ArrayList<Product> products,ArrayList<Order> orders,ArrayList<Customer> customers,ArrayList<OrderItem> orderitems){
        this.product.addAll(products);
        this.orders.addAll(orders);
        this.customer.addAll(customers);
        this.orderitem.addAll(orderitems);
    }
   void getAll(){
System.out.println(" Product Details :");
System.out.println(" ProductID "+"\t"+"Description"+"\t"+"Quantity"+"\t"+"Price");
       for(Product p:product){
           System.out.println("  "+p.productID+"   \t  \t "+p.description+"\t \t  "+p.quantityOnHand+"\t \t "+p.price);
       }
System.out.println(" Order Details :");
System.out.println(" Order Number "+"\t"+" CustomerID "+"\t"+" Date ");
       for(Order o:orders){
           System.out.println("  "+o.orderNumber+"\t\t  "+o.customerID+"\t\t"+o.date);
       }
System.out.println(" Customer Details :");
System.out.println(" CustomerID "+"  "+" First Name "+"  "+" Last Name "+" \t "+" Phone Number ");
       for(Customer c:customer){
           System.out.println("  "+c.CustomerID+"\t\t"+c.firstName+"\t\t"+c.lastName+"    \t  "+c.phoneNumber);
       }
System.out.println(" OrderItem Details :");
System.out.println(" Order Number "+"   "+" Line Number "+"   "+" ProductID "+"  "+" Description "+"  "+" Quantity "+"  \t  "+" Price ");
       for(OrderItem oi:orderitem){
           System.out.println("  "+oi.orderNumber+"\t\t  "+oi.lineNumber+"\t\t  "+oi.productID+"\t\t"+oi.productDescription+"\t\t"+oi.quantity+"\t\t"+oi.price);
       }
   }
}
