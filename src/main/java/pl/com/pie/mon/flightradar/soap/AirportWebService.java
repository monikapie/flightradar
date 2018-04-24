package pl.com.pie.mon.flightradar.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface AirportWebService {

    @WebMethod List<String> findAll();
}
