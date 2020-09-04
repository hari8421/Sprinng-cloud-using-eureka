package com.hotel.controller;

import java.util.List;

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

import com.hotel.domain.Reservation;
import com.hotel.service.ReservationService;

@RestController
@RequestMapping("/")
@Validated
public class ReservationController {
	
	@Autowired
	ReservationService  rService;
	
	private static final Logger logger = LoggerFactory.getLogger(ReservationController.class);
	
	@PostMapping("/addReservation")
	public ResponseEntity<Reservation>  addReservation(@RequestBody @Valid Reservation rReqst) {
		logger.info("addReservation started");
		Reservation rEntity= rService.addReservation(rReqst);
		return new ResponseEntity<Reservation>(rEntity,HttpStatus.CREATED);
	}
	@PutMapping("/updateReservation")
	public ResponseEntity<Reservation>  updateReservation(@RequestBody @Valid Reservation rReqst) {
		logger.info("updateReservation started");
		Reservation rEntity= rService.addReservation(rReqst);
		return new ResponseEntity<Reservation>(rEntity,HttpStatus.OK);
	}
	
	@GetMapping("/getAllReservations")
	public ResponseEntity<List<Reservation>>  getAllReservations() {
		logger.info("getAllReservations started");
		List<Reservation> rEntity= rService.getAllReservations();
		return new ResponseEntity<List<Reservation>>(rEntity,HttpStatus.OK);
	}
	

}
