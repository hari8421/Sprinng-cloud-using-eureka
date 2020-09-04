package com.hotel.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.domain.Guest;
import com.hotel.service.GuestService;

@RestController
@RequestMapping("/")
@Validated
public class GuestController {
	
	@Autowired
	GuestService gService;
	
	private static final Logger logger = LoggerFactory.getLogger(GuestController.class);
	
	@PostMapping("/addGuest")
	public ResponseEntity<Guest>  addGuest(@RequestBody @Valid Guest gReqst) {
		logger.info("addGuest started");
		Guest gEntity= gService.addGuest(gReqst);
		return new ResponseEntity<Guest>(gEntity,HttpStatus.CREATED);
	}
	
	

}
