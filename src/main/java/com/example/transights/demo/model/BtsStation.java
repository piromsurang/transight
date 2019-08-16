package com.example.transights.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class BtsStation {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long btsStationId;

    private String name;

    public BtsStation() {
    }

    public BtsStation(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBtsStationId() {
        return btsStationId;
    }

    public String getName() {
        return name;
    }
}
