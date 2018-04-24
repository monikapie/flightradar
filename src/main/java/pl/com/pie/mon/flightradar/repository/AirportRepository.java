package pl.com.pie.mon.flightradar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.com.pie.mon.flightradar.model.Airport;

import java.util.List;

@Repository
public interface AirportRepository extends JpaRepository<Airport, Long> {
        Airport findByName(String name);
        List<Airport> findByCity(String name);
}
