package com.itvedant.uservalidations.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itvedant.uservalidations.models.User;

public interface UserRepository extends JpaRepository<User, Integer>  {

	
}

