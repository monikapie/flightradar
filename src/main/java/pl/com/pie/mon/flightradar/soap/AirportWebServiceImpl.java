package pl.com.pie.mon.flightradar.soap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;
import pl.com.pie.mon.flightradar.model.Airport;
import pl.com.pie.mon.flightradar.service.AirportService;

import javax.jws.WebService;
import java.util.List;
import java.util.stream.Collectors;

@WebService(endpointInterface = "pl.com.pie.mon.flightradar.soap.AirportWebService", targetNamespace = "pl.com.pie.mon.flightradar")
public class AirportWebServiceImpl extends SpringBeanAutowiringSupport implements AirportWebService {
    @Autowired private AirportService airportService;

    @Override
    public List<String> findAll() {
        return airportService.findAll().stream().map(Airport::getName).collect(Collectors.toList());
    }
}
