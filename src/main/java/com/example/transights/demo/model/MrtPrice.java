package com.example.transights.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MrtPrice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idMrtPrice;

    private String mrtDeparture;
    private String mrtDestination;
    private double mrtPrice;

    public MrtPrice() {
    }

    public MrtPrice(String mrtDeparture, String mrtDestination, double mrtPrice) {
        this.mrtDeparture = mrtDeparture;
        this.mrtDestination = mrtDestination;
        this.mrtPrice = mrtPrice;
    }

    public void setMrtDeparture(String mrtDeparture) {
        this.mrtDeparture = mrtDeparture;
    }

    public void setMrtDestination(String mrtDestination) {
        this.mrtDestination = mrtDestination;
    }

    public void setMrtPrice(double mrtPrice) {
        this.mrtPrice = mrtPrice;
    }

    public long getIdMrtPrice() {
        return idMrtPrice;
    }

    public String getMrtDeparture() {
        return mrtDeparture;
    }

    public String getMrtDestination() {
        return mrtDestination;
    }

    public double getMrtPrice() {
        return mrtPrice;
    }
}
