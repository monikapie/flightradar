package pl.com.pie.mon.flightradar.model;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "airport")
@Getter
public class Airport {
    private static final long serialVersionUID = -3009157732242241606L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    String name;

    @Column(name = "city")
    String city;

    protected Airport() { }

    public Airport(String name, String city) {
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return String.format("Airport[id=%d, name='%s', city='%s']", id, name, city);
    }
}
