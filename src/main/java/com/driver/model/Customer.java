package com.driver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String mobNo;

    private String password;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<TripBooking> bookingList = new ArrayList<>();

    public Customer() {
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
