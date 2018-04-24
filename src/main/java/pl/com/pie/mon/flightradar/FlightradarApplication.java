package pl.com.pie.mon.flightradar;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import pl.com.pie.mon.flightradar.soap.*;

import javax.xml.ws.Endpoint;

@SpringBootApplication
public class FlightradarApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightradarApplication.class, args);
	}

	@Bean
	public ServletRegistrationBean dispatcherServlet() {
		return new ServletRegistrationBean(new CXFServlet(), "/soap-api/*");
	}

	@Bean(name = Bus.DEFAULT_BUS_ID)
	public SpringBus springBus() {
		return new SpringBus();
	}

	@Bean
	public FlightWebService flightService() {
		return new FlightWebServiceImpl();
	}

	@Bean
	public Endpoint flightEndpoint() {
		EndpointImpl endpoint = new EndpointImpl(springBus(), flightService());
		endpoint.publish("/FlightService");
		return endpoint;
	}

	@Bean
	public AirportWebService airportService() {
		return new AirportWebServiceImpl();
	}

	@Bean
	public Endpoint airportEndpoint() {
		EndpointImpl endpoint = new EndpointImpl(springBus(), airportService());
		endpoint.publish("/AirportService");
		return endpoint;
	}

	@Bean
	public PassengerWebService passengerWebService() {
		return new PassengerWebServiceImpl();
	}

	@Bean
	public Endpoint passengerEndpoint() {
		EndpointImpl endpoint = new EndpointImpl(springBus(), passengerWebService());
		endpoint.publish("/PassengerService");
		return endpoint;
	}

	@Bean
	public ReservationWebService reservationWebService() {
		return new ReservationWebServiceImpl();
	}

	@Bean
	public Endpoint reservationEndpoint() {
		EndpointImpl endpoint = new EndpointImpl(springBus(), reservationWebService());
		endpoint.publish("/ReservationService");
		return endpoint;
	}
}
