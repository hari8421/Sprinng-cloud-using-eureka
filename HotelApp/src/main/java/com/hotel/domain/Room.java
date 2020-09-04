package com.hotel.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


@Entity
@Table(name="room")
public class Room {
	

	@Id
	@GeneratedValue(generator = "sequence-generator")
	 @GenericGenerator(
		      name = "sequence-generator",
		      strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
		      parameters = {
		        @Parameter(name = "sequence_name", value = "room_sequence"),
		        @Parameter(name = "initial_value", value = "100"),
		        @Parameter(name = "increment_size", value = "1")
		        })
	@Column(name="ROOM_ID")
	private long room_id;
	
	@Column(name="BUILDING_NO")
	private long building_No;
	
	@Column(name="FLOOR_NO")
	private long floor_No;
	
	@Column(name="ROOM_TYPE_ID")
	@NotEmpty(message =  "Room type cannot be empty")
	private String roomType;
	
	
	
	@Column(name="IS_OCCUPIED")
	private int is_occupied;
	
	@ManyToOne
    @JoinColumn(name = "ROOM_TYPE_ID", nullable = false, updatable = false,insertable = false)
    private RoomType rTEntity;


	public RoomType getrTEntity() {
		return rTEntity;
	}


	public void setrTEntity(RoomType rTEntity) {
		this.rTEntity = rTEntity;
	}


	public long getRoom_id() {
		return room_id;
	}


	public void setRoom_id(long room_id) {
		this.room_id = room_id;
	}


	public String getRoomType() {
		return roomType;
	}


	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}



	public int getIs_occupied() {
		return is_occupied;
	}


	public void setIs_occupied(int is_occupied) {
		this.is_occupied = is_occupied;
	}


	public long getBuilding_No() {
		return building_No;
	}


	public void setBuilding_No(long building_No) {
		this.building_No = building_No;
	}


	public long getFloor_No() {
		return floor_No;
	}


	public void setFloor_No(long floor_No) {
		this.floor_No = floor_No;
	}
	
	
	
	

}
