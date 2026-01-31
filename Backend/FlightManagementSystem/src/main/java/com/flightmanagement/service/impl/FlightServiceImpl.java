package com.flightmanagement.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.flightmanagement.dto.FlightDTO;
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
    public List<FlightDTO> getAllFlights() {

        List<Flight> flights = flightRepository.findAll();
        List<FlightDTO> flightDTOList = new ArrayList<>();

        for (Flight flight : flights) {
            FlightDTO dto = new FlightDTO(
                    flight.getId(),
                    flight.getFlightnumber(),
                    flight.getSource(),
                    flight.getDestination(),
                    flight.getTotalseats()
            );
            flightDTOList.add(dto);
        }

        return flightDTOList;
    }


}
