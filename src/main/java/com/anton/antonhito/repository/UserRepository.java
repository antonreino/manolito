package com.anton.antonhito.repository;

import java.io.Serializable;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anton.antonhito.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Serializable> {
	
	
}
