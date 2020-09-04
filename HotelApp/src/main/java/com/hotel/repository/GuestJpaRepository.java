package com.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.domain.Guest;

public interface GuestJpaRepository extends JpaRepository<Guest, Long>{

}
