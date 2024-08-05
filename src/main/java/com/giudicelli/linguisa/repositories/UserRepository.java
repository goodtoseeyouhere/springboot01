package com.giudicelli.linguisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giudicelli.linguisa.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
