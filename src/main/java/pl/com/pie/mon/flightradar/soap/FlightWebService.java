package pl.com.pie.mon.flightradar.soap;

import pl.com.pie.mon.flightradar.model.Flight;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.Date;
import java.util.List;

@WebService
public interface FlightWebService {
    @WebMethod List<Flight> getFlightsByCities(String from, String to);

    @WebMethod List<Flight> getFlightsByCitiesAndDates(String from, String to, Date departure);

    @WebMethod List<Flight> findAll();
}
