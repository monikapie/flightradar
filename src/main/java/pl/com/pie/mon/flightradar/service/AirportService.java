package pl.com.pie.mon.flightradar.service;

import pl.com.pie.mon.flightradar.model.Airport;

import java.util.List;

public interface AirportService {
    Airport save(Airport city);

    Airport findByName(String name);

    Airport findByCityName(String cityName);

    List<Airport> findAll();
}
