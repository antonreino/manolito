package com.anton.antonhito.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.anton.antonhito.entity.User;
import com.anton.antonhito.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;
	@Override
	public List<User> findAllUser() {
		System.out.println("USERREPOSITORY");
		return userRepository.findAll();
	}

}
