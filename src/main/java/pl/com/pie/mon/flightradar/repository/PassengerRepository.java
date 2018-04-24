package pl.com.pie.mon.flightradar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.com.pie.mon.flightradar.model.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger,Long> {
    
}
