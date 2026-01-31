package com.flightmanagement.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.flightmanagement.dto.BookingDTO;
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
    public List<BookingDTO> getAllBookings() {

        List<Booking> bookings = bookingRepository.findAll();
        List<BookingDTO> bookingDTOList = new ArrayList<>();

        for (Booking booking : bookings) {
            BookingDTO dto = new BookingDTO(
                    booking.getId(),
                    booking.getUserId(),
                    booking.getFlightId(),
                    booking.getSeatsBooked()
            );
            bookingDTOList.add(dto);
        }

        return bookingDTOList;
    }


}
