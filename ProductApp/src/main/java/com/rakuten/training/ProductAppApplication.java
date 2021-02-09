package com.rakuten.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.rakuten.training.ui.ProductConsoleUi;

@SpringBootApplication
public class ProductAppApplication {

	public static void main(String[] args) {
		ApplicationContext springContainer = SpringApplication.run(ProductAppApplication.class, args);
		ProductConsoleUi ui = springContainer.getBean(ProductConsoleUi.class);
		ui.createProductWithUi();
	}

}
