package com.hotel.service;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.domain.Guest;
import com.hotel.repository.GuestJpaRepository;

@Service
public class GuestService {

	@Autowired
	GuestJpaRepository gRepository;
	
	
	private static final Logger logger = LoggerFactory.getLogger(GuestService.class);

	

	public Guest addGuest(@Valid Guest gReqst) {
		Guest gResponse=null;
		try {
			gResponse=gRepository.save(gReqst);
		} catch (Exception e) {
			logger.error("add guest service error-->"+e);
		}
		return gResponse;
	}

}
