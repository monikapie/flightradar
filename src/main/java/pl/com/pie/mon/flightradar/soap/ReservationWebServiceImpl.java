package pl.com.pie.mon.flightradar.soap;

import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.jws.WebService;

@WebService(endpointInterface = "pl.com.pie.mon.flightradar.soap.ReservationWebService", targetNamespace = "pl.com.pie.mon.flightradar")
public class ReservationWebServiceImpl extends SpringBeanAutowiringSupport implements ReservationWebService {
}
