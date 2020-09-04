package com.hotel.service;

import java.util.List;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.domain.Room;
import com.hotel.dto.RoomDTO;
import com.hotel.repository.RoomJpaRepository;

@Service
public class RoomService {

	@Autowired
	RoomJpaRepository rRepository;
	private static final ModelMapper modelMapper = new ModelMapper();
	
	private static final Logger logger = LoggerFactory.getLogger(RoomService.class);

	public RoomDTO addRoom(@Valid RoomDTO rReqst) {
		RoomDTO returnDTO=null;
		try {
			Room res=modelMapper.map(rReqst, Room.class);
			returnDTO= modelMapper.map(rRepository.save(res),RoomDTO.class);
		} catch (Exception e) {
			logger.error("Add room service error-->"+e);
		}
		return returnDTO;
	}

	public RoomDTO updateRoom(@Valid RoomDTO rReqst) {
		RoomDTO returnDTO=null;
		try {
			Room res=modelMapper.map(rReqst, Room.class);
			returnDTO= modelMapper.map(rRepository.save(res),RoomDTO.class);
		} catch (Exception e) {
			logger.error("Update room service error-->"+e);
		}
		return returnDTO;
	}

	public List<Room> getAllRoom() {
		return rRepository.findAll();
	}

	public List<Room> getAvailableRooms() {
		// TODO Auto-generated method stub
		return null;
	}

}
