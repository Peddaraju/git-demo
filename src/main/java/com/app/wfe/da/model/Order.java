/*
 * File Name: Order.java
 * Author : peddaram
 * Created On : 16 Apr, 2018
 */
package com.app.wfe.da.model;

import java.util.Date;

/**
 * The Class Order.
 */
public class Order {

	/**
	 * The id.
	 */
	private long id;

	/**
	 * The amount.
	 */
	private long amount;

	/**
	 * The date order.
	 */
	private Date dateOrder;
	
	/**
	 * The customer.
	 */
	private Customer customer;
	
	/**
	 * Gets the customer.
	 *
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * Sets the customer.
	 *
	 * @param customer the new customer
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * The product.
	 */
	private Product product;

	/**
	 * Gets the product.
	 *
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * Sets the product.
	 *
	 * @param product the new product
	 */
	public void setProduct(Product product) {
		this.product = product;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the new id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Gets the amount.
	 *
	 * @return the amount
	 */
	public long getAmount() {
		return amount;
	}

	/**
	 * Sets the amount.
	 *
	 * @param amount
	 *            the new amount
	 */
	public void setAmount(long amount) {
		this.amount = amount;
	}

	/**
	 * Gets the date order.
	 *
	 * @return the date order
	 */
	public Date getDateOrder() {
		return dateOrder;
	}

	/**
	 * Sets the date order.
	 *
	 * @param dateOrder
	 *            the new date order
	 */
	public void setDateOrder(Date dateOrder) {
		this.dateOrder = dateOrder;
	}

}
