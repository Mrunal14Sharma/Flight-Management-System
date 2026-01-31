package com.flightmanagement.service;

import java.util.List;

import com.flightmanagement.dto.UserDTO;
import com.flightmanagement.entity.User;

public interface UserService {

	List<UserDTO> getAllUsers();
	
}
