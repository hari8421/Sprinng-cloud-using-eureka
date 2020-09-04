package com.hotel.service;

import java.util.List;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.domain.User;
import com.hotel.dto.UserDTO;
import com.hotel.repository.UserJpaRepository;
@Service
public class UserService {

	
	@Autowired
	UserJpaRepository uRepository;
	private static final ModelMapper modelMapper = new ModelMapper();
	
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);

	public UserDTO addUser(UserDTO uReqst) {
		UserDTO returnDTO=null;
		try {
			User res=modelMapper.map(uReqst, User.class);
			returnDTO= modelMapper.map(uRepository.save(res),UserDTO.class);
		} catch (Exception e) {
			logger.error("addUser service error-->"+e);
		}
		return returnDTO;
	}

	public UserDTO updateUser(@Valid UserDTO uReqst) {
		UserDTO returnDTO=null;
		try {
			User res=modelMapper.map(uReqst, User.class);
			returnDTO= modelMapper.map(uRepository.save(res),UserDTO.class);
		} catch (Exception e) {
			logger.error("updateUser service error-->"+e);
		}
		return returnDTO;
	}

	public List<User> getAllUser() {
		
		return uRepository.findAll();
	}
	

}
