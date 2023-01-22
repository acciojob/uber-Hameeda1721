package com.driver.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Drivers")
public class Driver{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int driverId;

    private String Mobile;

    private String passWord;

    @OneToOne(mappedBy = "driver",cascade = CascadeType.ALL)
    private Cab cab;


    @OneToMany(mappedBy = "driver",cascade = CascadeType.ALL)
    private List<TripBooking> tripBookingList;


    public Driver(String mobile, String password) {
        this.Mobile = mobile;
        this.passWord = password;
    }

    public Driver() {
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        this.Mobile = mobile;
    }

    public String getPassword() {
        return passWord;
    }

    public void setPassword(String password) {
        this.passWord = password;
    }

    public Cab getCab() {
        return cab;
    }

    public void setCab(Cab cab) {
        this.cab = cab;
    }

    public List<TripBooking> getTripBookingList() {
        return tripBookingList;
    }

    public void setTripBookingList(List<TripBooking> tripBookingList) {
        this.tripBookingList = tripBookingList;
    }
}