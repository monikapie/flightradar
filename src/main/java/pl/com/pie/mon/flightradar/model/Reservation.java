package pl.com.pie.mon.flightradar.model;

import javax.persistence.*;

@Entity
@Table(name = "reservation")
public class Reservation {
    private static final long serialVersionUID = -3009157732242241606L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "flight")
    private Flight flight;

    @Column(name = "passenger")
    private Passenger passenger;

    @Column(name = "place_number")
    private int placeNumber;

    @Column(name = "cost")
    private float cost;

    @Column(name = "isPaid")
    private boolean isPaid;

    protected Reservation(){}

    public Reservation(Flight flight, Passenger passenger, int placeNumber, float cost) {
        this.flight = flight;
        this.passenger = passenger;
        this.placeNumber = placeNumber;
        this.cost = cost;
        this.isPaid = false;
    }

    @Override
    public String toString() {
        return String.format("Reservation[id=%d, flight='%s', passenger='%s', placeNumber='%s', cost='%s', isPaid='%s']"
                , id, flight, passenger, placeNumber, cost, isPaid);
    }
}
