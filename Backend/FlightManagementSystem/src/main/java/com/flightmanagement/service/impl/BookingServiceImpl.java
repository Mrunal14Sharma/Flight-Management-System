package com.flightmanagement.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.flightmanagement.entity.Booking;
import com.flightmanagement.repository.BookingRepository;
import com.flightmanagement.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService{
	
	private final BookingRepository bookingRepository;
	
    public BookingServiceImpl(BookingRepository bookingRepository) {
		this.bookingRepository = bookingRepository;
	}

	@Override
	public List<Booking> getAllBookings() {
		return bookingRepository.findAll();
	}

}
