package com.flightmanagement.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.flightmanagement.entity.Flight;
import com.flightmanagement.repository.FlightRepository;
import com.flightmanagement.service.FlightService;

@Service
public class FlightServiceImpl implements FlightService {
	
	private final FlightRepository flightRepository;
	
    public FlightServiceImpl(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

	@Override
	public List<Flight> getAllFlights() {
		return flightRepository.findAll();
	}

}
