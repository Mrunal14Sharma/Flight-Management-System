package com.flightmanagement.dto;

public class BookingDTO {

    private Long id;
    private Long userId;
    private Long flightId;
    private Integer seatsBooked;

    public BookingDTO(Long id, Long userId, Long flightId, Integer seatsBooked) {
        this.id = id;
        this.userId = userId;
        this.flightId = flightId;
        this.seatsBooked = seatsBooked;
    }

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getFlightId() {
        return flightId;
    }

    public Integer getSeatsBooked() {
        return seatsBooked;
    }
}
