package com.driver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="drivers")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String mobNo;

    private String password;

    @OneToOne
    @JoinColumn
    private Cab cab;

    @OneToMany(mappedBy = "driver", cascade = CascadeType.ALL)
    private List<TripBooking> bookingList = new ArrayList<>();

    public Driver() {
    }

    public Driver(String mobNo, String password) {
        this.mobNo = mobNo;
        this.password = password;
    }

    public Cab getCab() {
        return cab;
    }

    public void setCab(Cab cab) {
        this.cab = cab;
    }

    public List<TripBooking> getBookingList() {
        return bookingList;
    }

    public void setBookingList(List<TripBooking> bookingList) {
        this.bookingList = bookingList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
