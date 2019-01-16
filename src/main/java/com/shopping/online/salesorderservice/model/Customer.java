package com.shopping.online.salesorderservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="customer_sos")
public class Customer {

	public Customer() {
	}

	public Customer(@NotNull Integer id, @NotNull String email, @NotNull String firstName, @NotNull String lastName) {
		super();
		this.id = id;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Id
	@NotNull
	@Column(name ="cust_id")
	private Integer id;
	
	@NotNull
	@Column(name ="cust_email")
	private String email;
	
	@NotNull
	@Column(name ="cust_first_name")
	private String firstName;
	
	@NotNull
	@Column(name ="cust_last_name")
	private String lastName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
