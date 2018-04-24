package pl.com.pie.mon.flightradar.service.impl;

import pl.com.pie.mon.flightradar.model.Airport;
import pl.com.pie.mon.flightradar.model.Flight;
import pl.com.pie.mon.flightradar.service.FlightService;

import java.util.Date;
import java.util.List;

public class FlightServiceImpl implements FlightService {
    @Override
    public List<Flight> findByDepartureAirportAndArrivalAirport(Airport departureAirport, Airport arrivalAirport) {
        return null;
    }

    @Override
    public List<Flight> findByDateAndDepartureAirportAndArrivalAirport(Airport departureAirport, Airport arrivalAirport, Date earliestFlightDate) {
        return null;
    }

    @Override
    public List<Flight> findAll() {
        return null;
    }
}
