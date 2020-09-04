package com.hotel.service;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.domain.Reservation;
import com.hotel.repository.RservationJpaRepository;

@Service
public class ReservationService {

	@Autowired
	RservationJpaRepository rRepository;
	
	
	private static final Logger logger = LoggerFactory.getLogger(ReservationService.class);

	

	public Reservation addReservation(@Valid Reservation rReqst) {
		Reservation rResponse=null;
		try {
			rResponse=rRepository.save(rReqst);
		} catch (Exception e) {
			logger.error("addReservation service error-->"+e);
		}
		return rResponse;
	}



	public List<Reservation> getAllReservations() {
		
		return rRepository.findAll();
	}




}
