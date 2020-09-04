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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.domain.User;
import com.hotel.dto.UserDTO;
import com.hotel.service.UserService;

@RestController
@RequestMapping("/")
@Validated
public class UserController {
	
	@Autowired
	UserService uService;
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@PostMapping("/addUser")
	public ResponseEntity<UserDTO>  addUser(@RequestBody @Valid UserDTO uReqst) {
		logger.info("addUser started");
		UserDTO uEntity= uService.addUser(uReqst);
		return new ResponseEntity<UserDTO>(uEntity,HttpStatus.CREATED);
	}
	
	
	  @PostMapping("/updateUser") public ResponseEntity<UserDTO> updateUser(@RequestBody @Valid UserDTO uReqst) {
	  logger.error("updateUser started");
	  UserDTO uEntity= uService.updateUser(uReqst); 
	  return new ResponseEntity<UserDTO>(uEntity,HttpStatus.OK); }
	  
	  @GetMapping("/getAllUser") public ResponseEntity<List<User>> getAllUser() {
		  List<User> uList=uService.getAllUser(); 
		  return new ResponseEntity<List<User>>(uList,HttpStatus.OK); 
		  }
	  
	 

}
