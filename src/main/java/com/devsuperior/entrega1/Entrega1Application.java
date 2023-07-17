package com.devsuperior.entrega1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.entrega1.entities.Order;
import com.devsuperior.entrega1.services.OrderService;

@SpringBootApplication
public class Entrega1Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Entrega1Application.class, args);
	}
		@Autowired
		OrderService orderService;
		Order order = new Order(1034, 150.0, 20.0);
		
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Pedido código " + order.getCode());
		System.out.printf("Valor total: R$%.2f", orderService.total(order));
	}

}
