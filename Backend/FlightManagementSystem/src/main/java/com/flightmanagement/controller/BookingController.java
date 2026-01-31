package com.flightmanagement.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightmanagement.dto.BookingDTO;
import com.flightmanagement.entity.Booking;
import com.flightmanagement.service.BookingService;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {
	
    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }
    
    @GetMapping
    public List<BookingDTO> getAllBookings(){
    	return bookingService.getAllBookings();
    }

}
