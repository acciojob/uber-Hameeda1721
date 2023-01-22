package com.driver.model;

import javax.persistence.*;

@Entity
public class Cab {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;

    private int perKmRate;

    @Column(columnDefinition = "TINYINT(1)")
    private boolean available;

    @OneToOne()
    @JoinColumn
    private Driver Driver;

    public Cab(int perKmRate, boolean available) {
        this.perKmRate = perKmRate;
        this.available = available;
    }

    public Cab() {
    }

    public int getId() {
        return ID;
    }

    public void setId(int id) {
        this.ID= id;
    }

    public int getPerKmRate() {
        return perKmRate;
    }

    public void setPerKmRate(int perKmRate) {
        this.perKmRate = perKmRate;
    }

    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Driver getDriver() {
        return Driver;
    }

    public void setDriver(Driver driver) {
        this.Driver = driver;
    }
}