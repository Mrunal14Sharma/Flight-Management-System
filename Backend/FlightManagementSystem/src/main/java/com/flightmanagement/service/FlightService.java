package com.flightmanagement.service;

import java.util.List;

import com.flightmanagement.dto.FlightDTO;
import com.flightmanagement.entity.Flight;

public interface FlightService {

	List<FlightDTO> getAllFlights();
	
}
