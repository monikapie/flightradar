package pl.com.pie.mon.flightradar.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="flight")
public class Flight implements Serializable {
    private static final long serialVersionUID = -3009157732242241606L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "departure_airport")
    private Airport departureAirport;

    @Column(name = "arrival_airport")
    private Airport arrivalAirport;

    @Column(name = "departure_time")
    private Date departureTime;

    @Column(name = "arrival_time")
    private Date arrivalTime;

    protected Flight() { }

    public Flight(Airport departureAirport, Airport arrivalAirport, Date departureTime, Date arrivalTime) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    @Override
    public String toString() {
        return String.format("Flight[id=%d, departureAirport='%s', departureTime='%s, arrivalAirport='%s', arrivalTime='%s']"
                , id, departureAirport, departureTime,arrivalAirport,arrivalTime) ;
    }
}
