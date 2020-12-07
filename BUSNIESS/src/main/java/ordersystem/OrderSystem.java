/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package ordersystem;


import java.util.ArrayList;



public class OrderSystem
 {
   
 public static void main(String[] args) 
	
	{
	
RepositoryCustomer repositoryCustomer = new RepositoryCustomer();

	RepositoryOrder repositoryOrder = new RepositoryOrder();

	RepositoryOrderItem repositoryOrderItem = new RepositoryOrderItem();
	
RepositoryProduct repositoryProduct = new RepositoryProduct();
 
	 
Customer customer1 = new Customer(38583, "Allan", "Turing", "11456793");
	
Customer customer2 = new Customer(38584, "Mark", "Zukerbag", "11532754");
	
Customer customer3 = new Customer(38585, "Marry", "Zarrie", "12465438");
  
	
repositoryCustomer.Create(customer1);

	repositoryCustomer.Create(customer2);
	
repositoryCustomer.Create(customer3);
  
	
Product product1 = new Product(00, "Iphone 11 Pro Max", 5, 5000);
	
Product product2 = new Product(01, "Sony dz350 HomeTheatre", 7, 6000);
	
Product product3 = new Product(02, "Samsung S5", 9, 7000);
	
Product product4 = new Product(03, "JBL eardots", 11, 8000);

	Product product5 = new Product(04, "Electric cooker", 30, 3400);
	
Product product6 = new Product(05, "Water Dispensor", 16, 600);
	
repositoryProduct.Create(product1);
	
repositoryProduct.Create(product2);
	
repositoryProduct.Create(product3);
	
repositoryProduct.Create(product4);
	
repositoryProduct.Create(product5);
	
repositoryProduct.Create(product6);
 
	
	 
Order order1 = new Order(700, 38583, "03/12/20");
	Order order2 = new Order(701, 38584, "14/12/20");

	Order order3 = new Order(702, 38585, "11/12/20");

	
repositoryOrder.Create(order1);
	
repositoryOrder.Create(order2);
	
repositoryOrder.Create(order3);

	  
OrderItem orderItem1 = new OrderItem(700, 406, 00, "Iphone 11 Pro Max", 4, 2999);

	OrderItem orderItem2 = new OrderItem(700, 407, 01, "Sony dz350 HomeTheatre", 3, 7839);
	
OrderItem orderItem3 = new OrderItem(701, 408, 02, "Samsung S5", 8, 63550);
	
OrderItem orderItem4 = new OrderItem(701, 409, 03, "JBL eardots", 96, 9345);
	
OrderItem orderItem5 = new OrderItem(702, 410, 04, "Electric cooker", 16, 54400);

	OrderItem orderItem6 = new OrderItem(702, 411, 05, "Water Dispensor", 7, 4200);
  
	
repositoryOrderItem.Create(orderItem1);

	repositoryOrderItem.Create(orderItem2);
	
repositoryOrderItem.Create(orderItem3);
	
repositoryOrderItem.Create(orderItem4);
	
repositoryOrderItem.Create(orderItem5);

	repositoryOrderItem.Create(orderItem6);

	  
ArrayList <Customer> customers = repositoryCustomer.GetAll();
	
ArrayList <Order> order = repositoryOrder.GetAll();
	
ArrayList <OrderItem> orderItem = repositoryOrderItem.GetAll();

	ArrayList <Product> products = repositoryProduct.GetAll();

 
	 
for (int i = 0; i < customers.size(); i++)
	 {

	   for (int y = 0; y < orderItem.size(); y++) 
		{

		   if (customers.get(i).getCustomerID() == order.get(i).getCustomerID())
			 {
                           
if (order.get(i).getOrderNumber() == orderItem.get(y).getOrderNumber())
				 {
                                 
System.out.println("**************************************\nCustomer: \n-------------------------------------\n"
        +customers.get(i).toString()+
   "\nOrder Placed: \n-------------------------------------\n"+order.get(i).toString()+
        "\nOrder Items: \n-------------------------------------\n"+orderItem.get(i).toString()+
        "**************************************\n");

			//System.out.println(order.get(i).toString());
			
//System.out.println(orderItem.get(i).toString());

				}

			}

		}
	
}

}

}
