package pl.com.pie.mon.flightradar.soap;

import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.jws.WebService;

@WebService(endpointInterface = "pl.com.pie.mon.flightradar.soap.PassengerWebService", targetNamespace = "pl.com.pie.mon.flightradar")
public class PassengerWebServiceImpl extends SpringBeanAutowiringSupport implements PassengerWebService {
}
