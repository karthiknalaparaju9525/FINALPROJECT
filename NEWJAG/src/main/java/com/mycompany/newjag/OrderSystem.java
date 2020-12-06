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


public class OrderSystem {
    public OrderSystem() {
        super();
    }
    public static void main(String[]  args){
  ArrayList<Customer> customers=new ArrayList<Customer>();
  ArrayList<Product> product=new ArrayList<Product>();
  ArrayList<Order> orders=new ArrayList<Order>();
  ArrayList<OrderItem> orderitem=new ArrayList<OrderItem>();
        Customer c=new Customer(101,"Praveen","Thipparthi","9876543210");
        Customer c1=new Customer(109,"Ramesh","Dendi","9876543210");
        Customer c2=new Customer(121,"Samatha","Sripathi","9440324568");
        Product p=new Product(012,"LED TV",12,12450.50);
        Product p1=new Product(021,"Iphone",5,76740.50);
        Product p2=new Product(051,"Laptop",10,42350.50);
        Order o=new Order(1001,101,"12/11/2019");
        Order o1=new Order(1011,101,"12/10/2020");
        Order o2=new Order(1221,109,"4/05/2020");
        OrderItem oi=new OrderItem(10001,2001,012,"LED TV",1,12450.50);
        OrderItem oi1=new OrderItem(10101,2011,021,"Iphone",1,76740.50);
        OrderItem oi2=new OrderItem(10201,2091,051,"Laptop",1,42350.50);
        customers.add(c);
        customers.add(c1);
        customers.add(c2);
        product.add(p);
        product.add(p1);
        product.add(p2);
        orders.add(o);
        orders.add(o1);
        orders.add(o2);
        orderitem.add(oi);
        orderitem.add(oi1);
        orderitem.add(oi2);
            
        Repository r=new Repository();
        r.create(product, orders, customers, orderitem);
        r.getAll();
    }
}
