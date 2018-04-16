/*
 * File Name: Product.java
 * Author : peddaram
 * Created On : 16 Apr, 2018
 */
package com.app.wfe.da.model;

/**
 * The Class Product.
 */
public class Product {

	/**
	 * The id.
	 */
	private long id;

	/**
	 * The sku.
	 */
	private String sku;

	/**
	 * The description.
	 */
	private String description;

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
	 * Gets the sku.
	 *
	 * @return the sku
	 */
	public String getSku() {
		return sku;
	}

	/**
	 * Sets the sku.
	 *
	 * @param sku
	 *            the new sku
	 */
	public void setSku(String sku) {
		this.sku = sku;
	}

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description
	 *            the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}
