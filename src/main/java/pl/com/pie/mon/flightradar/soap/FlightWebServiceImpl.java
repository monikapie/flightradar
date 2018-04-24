package pl.com.pie.mon.flightradar.soap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;
import pl.com.pie.mon.flightradar.model.Airport;
import pl.com.pie.mon.flightradar.model.Flight;
import pl.com.pie.mon.flightradar.service.AirportService;
import pl.com.pie.mon.flightradar.service.FlightService;

import javax.jws.WebService;
import java.util.Date;
import java.util.List;

@WebService(endpointInterface = "pl.com.pie.mon.flightradar.soap.FlightWebService", targetNamespace = "pl.com.pie.mon.flightradar")
public class FlightWebServiceImpl extends SpringBeanAutowiringSupport implements FlightWebService {
    @Autowired private FlightService flightService;
    @Autowired private AirportService airportService;

    @Override
    public List<Flight> getFlightsByCities(String from, String to) {
        Airport airportFrom = airportService.findByCityName(from);
        Airport airportTo = airportService.findByCityName(to);
        return flightService.findByDepartureAirportAndArrivalAirport(airportFrom, airportTo);
    }

    @Override
    public List<Flight> getFlightsByCitiesAndDates(String from, String to, Date departureDate) {
        Airport airportFrom = airportService.findByCityName(from);
        Airport airportTo = airportService.findByCityName(to);
        return flightService.findByDateAndDepartureAirportAndArrivalAirport(airportFrom, airportTo, departureDate);
    }

    @Override
    public List<Flight> findAll() {
        return flightService.findAll();
    }
}
