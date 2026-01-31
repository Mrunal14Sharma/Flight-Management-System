package com.flightmanagement.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.flightmanagement.dto.UserDTO;
import com.flightmanagement.entity.User;
import com.flightmanagement.repository.UserRepository;
import com.flightmanagement.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	private final UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public List<UserDTO> getAllUsers() {

	    List<User> users = userRepository.findAll();
	    List<UserDTO> userDTOList = new ArrayList<>();

	    for (User user : users) {
	        UserDTO dto = new UserDTO(
	                user.getId(),
	                user.getName(),
	                user.getEmail()
	        );
	        userDTOList.add(dto);
	    }

	    return userDTOList;
	}


}
