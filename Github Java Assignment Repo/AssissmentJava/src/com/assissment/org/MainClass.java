package com.assissment.org;

import java.util.List;
import java.util.Scanner;

import com.assissment.org.order.Order;
import com.assissment.org.products.Products;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		CustomerRegister cr = new CustomerRegister();
		AddProduct ap=new AddProduct();

		int x = 0;

		do {
			System.out.println("Enter The Details as given :");
			System.out.println("1.Register a Customer");
			System.out.println("2.Create a Product");
			System.out.println("3.Create an order");
			System.out.println("4.View Orders");
			System.out.println("5.Exit");
			x = sc.nextInt();

			switch (x) {
			case 1:
				cr.inputDetails();
				break;
			case 2:
				/*
				List<Customer> l = cr.getCustomer(1);
				Iterator itr = l.iterator();
				while (itr.hasNext()) {
					System.out.println(l);
				}
				*/
				ap.inputProductDetails();
				break;
				
			case 3:
				List<Customer> l=cr.getCustomer();
				boolean value=new Order().login(l);
				if(value) {
					List<Products> lp=ap.getProducts();
					lp.forEach(System.out::println);
					for(Products p:lp) {
						
					}
					lp.forEach(product->{
						System.out.println(product.getName());
					});
				}
				else {
					System.out.println("Wrong Creditentials");
					break;
				}
				
			default:
				System.out.println("Invalid Entry");

			}

		} while (x != 5);

	}

}
