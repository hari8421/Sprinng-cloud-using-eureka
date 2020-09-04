package com.hotel.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.dto.RoomDTO;
import com.hotel.domain.Room;
import com.hotel.service.RoomService;

@RestController
@RequestMapping("/")
@Validated
public class RoomController {
	
	@Autowired
	RoomService rService;
	
	private static final Logger logger = LoggerFactory.getLogger(RoomController.class);
	
	@PostMapping("/addRoom")
	public ResponseEntity<RoomDTO>  addRoom(@RequestBody @Valid RoomDTO rReqst) {
		logger.info("addRoom started");
		RoomDTO rEntity= rService.addRoom(rReqst);
		return new ResponseEntity<RoomDTO>(rEntity,HttpStatus.CREATED);
	}
	
	
	@PutMapping("/updateRoom")
	public ResponseEntity<RoomDTO>  updateRoom(@RequestBody @Valid RoomDTO rReqst) {
		logger.info("addRoom started");
		RoomDTO rEntity= rService.updateRoom(rReqst);
		return new ResponseEntity<RoomDTO>(rEntity,HttpStatus.OK);
	}
	  
	@GetMapping("/getAllRoom")
	public ResponseEntity<List<Room>>  getAllRoom() {
		logger.info("getAllRoom started");
		List<Room> rEntity= rService.getAllRoom();
		return new ResponseEntity<List<Room>>(rEntity,HttpStatus.OK);
	}
	@GetMapping("/getAvailabeRoom")
	public ResponseEntity<List<Room>>  getAvailabeRoom() {
		logger.info("getAvailabeRoom started");
		List<Room> rEntity= rService.getAllRoom().stream().filter(Room->Room.getIs_occupied()==0).collect(Collectors.toList());
		return new ResponseEntity<List<Room>>(rEntity,HttpStatus.OK);
	}
	

}
