package com.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.domain.Reservation;

public interface RservationJpaRepository extends JpaRepository<Reservation, Long>{

}
