package com.rakuten.training.ui;

import java.util.Scanner;

import com.rakuten.training.domain.Product;
import com.rakuten.training.service.ProductService;
import com.rakuten.training.service.ProductServiceImpl;

public class ProductConsoleUi {
	
	ProductService service; // = new ProductServiceImpl();
	
	
	public void createProductWithUi() {
		try(Scanner kb = new Scanner(System.in)){
			System.out.println("Enter a name:");
			String name = kb.nextLine();
			System.out.println("Enter a price:");
			float price = Float.parseFloat(kb.nextLine());
			System.out.println("Enter a QoH:");
			int qoh = Integer.parseInt(kb.nextLine());
			
			
			Product toBeCreated = new Product(name, price, qoh);
			int id = service.createNewProduct(toBeCreated);
			System.out.println("Created Product with ID: "+id);
	}

}


	public void setService(ProductService service) {
		this.service = service;
		
	}



}
