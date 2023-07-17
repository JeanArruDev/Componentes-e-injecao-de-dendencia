package com.devsuperior.entrega1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.entrega1.entities.Order;

@Service
public class OrderService {
	
	@Autowired
	ShippingService shipping;
	
	public double total(Order order) {
		return order.getBasic() * ((100.0 - order.getDiscount())/100) + shipping.shipment(order);
	}
}
