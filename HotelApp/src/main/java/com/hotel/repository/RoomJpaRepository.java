package com.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.domain.Room;

public interface RoomJpaRepository extends JpaRepository<Room, String>{
	

}
