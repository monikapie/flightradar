package pl.com.pie.mon.flightradar.service;

import pl.com.pie.mon.flightradar.model.Airport;
import pl.com.pie.mon.flightradar.model.Flight;

import java.util.Date;
import java.util.List;

public interface FlightService {
    List<Flight> findByDepartureAirportAndArrivalAirport(Airport departureAirport, Airport arrivalAirport);

    List<Flight> findByDateAndDepartureAirportAndArrivalAirport(Airport departureAirport, Airport arrivalAirport, Date earliestFlightDate);

    List<Flight> findAll();
}
