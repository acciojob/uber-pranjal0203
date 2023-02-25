package com.driver.model;

import javax.persistence.*;

@Entity
@Table(name="cabs")
public class Cab {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int perKmRate;

    private boolean isAvailable;

    @OneToOne(mappedBy = "cab", cascade = CascadeType.ALL)
    private Driver driver;

    public Cab() {
    }

    public Cab(int perKmRate) {
        this.perKmRate = perKmRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPerKmRate() {
        return perKmRate;
    }

    public void setPerKmRate(int perKmRate) {
        this.perKmRate = perKmRate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
