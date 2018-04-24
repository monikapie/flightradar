package pl.com.pie.mon.flightradar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.com.pie.mon.flightradar.model.Airport;
import pl.com.pie.mon.flightradar.model.Flight;

import java.util.Date;
import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long>{
    List<Flight> findByDepartureAirportAndArrivalAirport(Airport departureAirport, Airport arrivalAirport);
    List<Flight> findByDateAndDepartureAirportAndArrivalAirport(Date earliestFlightDate);
}
