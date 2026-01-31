package com.flightmanagement.service;

import java.util.List;

import com.flightmanagement.dto.BookingDTO;
import com.flightmanagement.entity.Booking;

public interface BookingService {

	List<BookingDTO> getAllBookings();
	
}
