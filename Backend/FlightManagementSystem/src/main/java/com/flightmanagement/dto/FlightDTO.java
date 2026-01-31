package com.flightmanagement.dto;

public class FlightDTO {

    private Long id;
    private String flightnumber;
    private String source;
    private String destination;
    private String totalseats;

    public FlightDTO(Long id, String flightnumber, String source,
                     String destination, String totalseats) {
        this.id = id;
        this.flightnumber = flightnumber;
        this.source = source;
        this.destination = destination;
        this.totalseats = totalseats;
    }

    public Long getId() {
        return id;
    }

    public String getFlightnumber() {
        return flightnumber;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public String getTotalseats() {
        return totalseats;
    }
}
