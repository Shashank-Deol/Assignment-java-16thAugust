package com.assissment.org.order;

import java.util.List;
import java.util.Scanner;

import com.assissment.org.Customer;

public class Order {
	
	Scanner sc=new Scanner(System.in);
	
	public boolean login(List<Customer> l) {
		System.out.println("Please enter id");
		int idEntered=sc.nextInt();
		System.out.println("Enter name:");
		String nameEntered=sc.next();
		System.out.println("Enter Password");
		String passwordEntered=sc.next();
		
		//if(l.get(0))
		for(int i=0;i<l.size();i++) {
			Customer c=l.get(i);
			if( c.getId()==idEntered && c.getName().equals(nameEntered)&&c.getPassword().contentEquals(passwordEntered)) {
				return true;
			}
		}
		
		return false;
	}
}
