package com.hotel.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="rservation")
public class Reservation {
	

	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	@Column(name="RESERVATION_ID")
	private long reservation_id;
	

	
	@Column(name="STATUS")
	private String status;
	
	@Column(name="NO_OF_ADULTS")
	private int no_of_adults;
	@Column(name="NO_OF_NIGHTS")
	private int no_of_nights;
	
	@Column(name="NO_OF_CHILDREN")
	private int no_of_children;
	
	@Column(name="CHECK_IN")
	private String check_in;
	
	@Column(name="CHECK_OUT")
	private String check_out;
	
	@Column(name="ROOM_ID")
	private long room_id;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			  name = "guest_list", 
			  joinColumns = @JoinColumn(name = "guest_id"), 
			  inverseJoinColumns = @JoinColumn(name = "reservation_id"))
    Set<Guest> guest;

	
	
	public Set<Guest> getGuest() {
		return guest;
	}

	public void setGuest(Set<Guest> guest) {
		this.guest = guest;
	}

	public long getReservation_id() {
		return reservation_id;
	}

	public void setReservation_id(long reservation_id) {
		this.reservation_id = reservation_id;
	}



	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getNo_of_adults() {
		return no_of_adults;
	}

	public void setNo_of_adults(int no_of_adults) {
		this.no_of_adults = no_of_adults;
	}

	public int getNo_of_nights() {
		return no_of_nights;
	}

	public void setNo_of_nights(int no_of_nights) {
		this.no_of_nights = no_of_nights;
	}

	public int getNo_of_children() {
		return no_of_children;
	}

	public void setNo_of_children(int no_of_children) {
		this.no_of_children = no_of_children;
	}

	public String getCheck_in() {
		return check_in;
	}

	public void setCheck_in(String check_in) {
		this.check_in = check_in;
	}

	public String getCheck_out() {
		return check_out;
	}

	public void setCheck_out(String check_out) {
		this.check_out = check_out;
	}
	
	@ManyToOne
    @JoinColumn(name = "ROOM_ID", nullable = false, updatable = false,insertable = false)
    private Room rEntity;

	public long getRoom_id() {
		return room_id;
	}

	public void setRoom_id(long room_id) {
		this.room_id = room_id;
	}

	public Room getrEntity() {
		return rEntity;
	}

	public void setrEntity(Room rEntity) {
		this.rEntity = rEntity;
	}
	
	

	

}
