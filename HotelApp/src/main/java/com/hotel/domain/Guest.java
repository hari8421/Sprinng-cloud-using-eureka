package com.hotel.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="guest")
public class Guest {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name="GUEST_ID")
	private long guest_id;
	
	@Column(name="MEMBER_CODE")
	private String member_code;
	
	@Column(name="COMPANY")
	private String company;
	
	@Column(name="PHONE_NO")
	private String phone_no;
	
	@Column(name="NAME")
	private String name;
	
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="ADDRESS")
	private String address;
	
	 @ManyToMany(mappedBy = "guest")
	 Set<Reservation> guestLink;

	public long getGuest_id() {
		return guest_id;
	}

	public void setGuest_id(long guest_id) {
		this.guest_id = guest_id;
	}

	public String getMember_code() {
		return member_code;
	}

	public void setMember_code(String member_code) {
		this.member_code = member_code;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

	

}
