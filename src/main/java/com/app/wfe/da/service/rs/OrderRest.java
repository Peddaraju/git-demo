/*
 * File Name: OrderRest.java
 * Author : peddaram
 * Created On : 16 Apr, 2018
 */
package com.app.wfe.da.service.rs;

import java.util.Date;

import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.web.client.RestTemplate;

import com.app.wfe.da.model.Customer;
import com.app.wfe.da.model.Order;
import com.app.wfe.da.model.Product;

/**
 * The Class OrderRest.
 */
@Named
@Path("/")
public class OrderRest {

	/**
	 * The id.
	 */
	private long id = 1;

	/**
	 * The rest template.
	 */
	private RestTemplate restTemplate;

	/**
	 * Submit order.
	 *
	 * @param idCustomer the id customer
	 * @param idProduct the id product
	 * @param amount the amount
	 * @return the order
	 */
	@GET
	@Path("order")
	@Produces(MediaType.APPLICATION_JSON)
	public Order submitOrder(
			@QueryParam("idCustomer") long idCustomer,
			@QueryParam("idProduct") long idProduct,
			@QueryParam("amount") long amount) {

		Order order = new Order();

		Customer customer = restTemplate.getForObject("http://localhost:8080/customer?id={id}", Customer.class,
				idCustomer);
		Product product = restTemplate.getForObject("http://localhost:8080/product?id={id}", Product.class, idProduct);

		order.setCustomer(customer);
		order.setProduct(product);
		order.setId(id);
		order.setAmount(amount);
		order.setDateOrder(new Date());
		id++;
		return order;
	}
}
