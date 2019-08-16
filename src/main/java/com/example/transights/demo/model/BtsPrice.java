package com.example.transights.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class BtsPrice {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long btsPriceId;

    private String btsDeparture;
    private String btsDestination;
    private double btsPrice;

    public BtsPrice() {
    }

    public BtsPrice(String btsDeparture, String btsDestination, double btsPrice) {
        this.btsDeparture = btsDeparture;
        this.btsDestination = btsDestination;
        this.btsPrice = btsPrice;
    }

    public long getBtsPriceId() {
        return btsPriceId;
    }

    public void setBtsPriceId(long btsPriceId) {
        this.btsPriceId = btsPriceId;
    }

    public String getBtsDeparture() {
        return btsDeparture;
    }

    public void setBtsDeparture(String btsDeparture) {
        this.btsDeparture = btsDeparture;
    }

    public String getBtsDestination() {
        return btsDestination;
    }

    public void setBtsDestination(String btsDestination) {
        this.btsDestination = btsDestination;
    }

    public double getBtsPrice() {
        return btsPrice;
    }

    public void setBtsPrice(double btsPrice) {
        this.btsPrice = btsPrice;
    }
}
