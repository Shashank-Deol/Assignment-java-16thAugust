package com.assissment.org;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CustomerRegister {
	private List<Customer> listCustomer=new ArrayList<>(Arrays.asList());
	
	Scanner sc=new Scanner(System.in);
	
	public void inputDetails() {
		System.out.println("Please Enter ID:");
		int id=sc.nextInt();
		System.out.println("Please Enter name:");
		String name=sc.next();
		System.out.println("Please Enter password:");
		String pass=sc.next();
		System.out.println("Please Enter email:");
		String email=sc.next();
		
		listCustomer.add(new Customer(id,name,pass,email));
		
	}


	public List<Customer> getCustomer() {
		
		return (List<Customer>) listCustomer;
		//return listCustomer.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	
}
