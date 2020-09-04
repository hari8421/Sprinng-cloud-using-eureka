package com.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.domain.User;

public interface UserJpaRepository extends JpaRepository<User, String>{

}
