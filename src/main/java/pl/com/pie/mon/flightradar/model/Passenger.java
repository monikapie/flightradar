package pl.com.pie.mon.flightradar.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "passenger")
public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    String name;

    @Column(name = "surname")
    String surname;

    @Column(name = "birth_date")
    Date birthDate;

    protected Passenger() {
    }

    public Passenger(String name, String surname, Date birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return String.format("Passenger[id=%d, name='%s', surname='%s', birthDate='%s']", id, name, surname, birthDate);
    }
}
