package com.hotel.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="user")
public class User {
	

	@Id
	@GeneratedValue(generator = "sequence-generator")
	 @GenericGenerator(
		      name = "sequence-generator",
		      strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
		      parameters = {
		        @Parameter(name = "sequence_name", value = "user_sequence"),
		        @Parameter(name = "prefix", value = "E-"),
		        @Parameter(name = "initial_value", value = "100"),
		        @Parameter(name = "increment_size", value = "1")
		        })
	@Column(name="USER_ID")
	private long user_id;
	
	@Column(name="USER_ROLE")
	@NotEmpty(message =  "User role cannot be empty")
	private String user_role;
	
	@Column(name="NAME")
	@NotEmpty(message =  "Name cannot be empty")
	private String name;
	
	
	@Column(name="ADDRESS")
	private String address;
	
	@Column(name="IS_ACTIVE")
	private String isActive;

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public String getUser_role() {
		return user_role;
	}

	public void setUser_role(String user_role) {
		this.user_role = user_role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}


	

}
