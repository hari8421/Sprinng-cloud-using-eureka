package com.hotel.dto;

public class RoomDTO {


	
	private long room_id;
	private String roomType;
	private int is_occupied;
	private long building_No;
	private long floor_No;
	
	
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
	
	

}
