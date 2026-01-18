package com.flightmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightmanagement.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
