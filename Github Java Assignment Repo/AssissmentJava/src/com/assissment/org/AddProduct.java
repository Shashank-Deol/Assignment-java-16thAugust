package com.assissment.org;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.assissment.org.products.Products;

public class AddProduct {
	private List<Products> listProducts = new ArrayList<>(Arrays.asList());

	Scanner sc = new Scanner(System.in);

	public void inputProductDetails() {
		System.out.println("Please Enter ID:");
		int id = sc.nextInt();
		System.out.println("Please Enter name:");
		String name = sc.next();

		listProducts.add(new Products(id, name));

	}

	public List<Products> getProducts() {

		return (List<Products>) listProducts;
		// return listCustomer.stream().filter(t ->
		// t.getId().equals(id)).findFirst().get();
	}

}
