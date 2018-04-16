/*
 * File Name: ProductRest.java
 * Author : peddaram
 * Created On : 16 Apr, 2018
 */
package com.app.wfe.da.service.rs;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.app.wfe.da.model.Product;

/**
 * The Class ProductRest.
 */
@Named
@Path("/")
public class ProductRest {

	/**
	 * The products.
	 */
	private static List<Product> products = new ArrayList<Product>();
	static {
		Product product1 = new Product();
		product1.setId(1);
		product1.setSku("abcd1");
		product1.setDescription("Product1");
		Product product2 = new Product();
		product2.setId(2);
		product2.setSku("abcd2");
		product2.setDescription("Product2");
		Product product3 = new Product();
		product3.setId(3);
		product3.setSku("abcd3");
		product3.setDescription("Product3");
		Product product4 = new Product();
		product4.setId(4);
		product4.setSku("abcd4");
		product4.setDescription("Product4");
		products.add(product1);
		products.add(product2);
		products.add(product3);
		products.add(product4);
	}

	/**
	 * Gets the products.
	 *
	 * @return the products
	 */
	@GET
	@Path("products")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> getProducts() {
		return products;
	}

	/**
	 * Gets the product.
	 *
	 * @param id the id
	 * @return the product
	 */
	@GET
	@Path("product")
	@Produces(MediaType.APPLICATION_JSON)
	public Product getProduct(@QueryParam("id") long id) {
		Product prod = null;
		for (Product product : products) {
			if (product.getId() == id) {
				prod = product;
				break;
			}
		}
		return prod;
	}
}
