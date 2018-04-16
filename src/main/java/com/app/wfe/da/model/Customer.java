/*
 * File Name: Customer.java
 * Author : peddaram
 * Created On : 16 Apr, 2018
 */
package com.app.wfe.da.model;

/**
 * The Class Customer.
 */
public class Customer {

	/**
	 * The id.
	 */
	private long id;

	/**
	 * The name.
	 */
	private String name;
	
	/**
	 * The email.
	 */
	private String email;

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
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
}
