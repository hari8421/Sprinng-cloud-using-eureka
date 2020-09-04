package com.trivago.domain;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="room_type")
public class RoomType {
	

	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	@Column(name="ROOM_TYPE_ID")
	private long room_type_id;
	
	@Column(name="STATUS")
	private String status;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="STANDARD_PRICE")
	private BigDecimal standard_price;
	
	@Column(name="SINGLE_PRICE")
	private BigDecimal single_price;

	@Column(name="NO_OF_ADULTS")
	private int no_of_adults;
	
	@Column(name="EXTRA_ADULTS")
	private int extra_adults;
	
	@Column(name="NO_OF_CHILDREN")
	private int no_of_children;
	

	 @OneToMany(mappedBy = "rTEntity")
	 private List<Room> reEntity;

	public long getRoom_type_id() {
		return room_type_id;
	}

	public void setRoom_type_id(long room_type_id) {
		this.room_type_id = room_type_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getStandard_price() {
		return standard_price;
	}

	public void setStandard_price(BigDecimal standard_price) {
		this.standard_price = standard_price;
	}

	public BigDecimal getSingle_price() {
		return single_price;
	}

	public void setSingle_price(BigDecimal single_price) {
		this.single_price = single_price;
	}

	public int getNo_of_adults() {
		return no_of_adults;
	}

	public void setNo_of_adults(int no_of_adults) {
		this.no_of_adults = no_of_adults;
	}

	public int getExtra_adults() {
		return extra_adults;
	}

	public void setExtra_adults(int extra_adults) {
		this.extra_adults = extra_adults;
	}

	public int getNo_of_children() {
		return no_of_children;
	}

	public void setNo_of_children(int no_of_children) {
		this.no_of_children = no_of_children;
	}
	
	
	

}
