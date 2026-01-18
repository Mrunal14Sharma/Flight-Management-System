package com.flightmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightmanagement.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {

}
