package com.example.transights.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long placeId;

    private String name;
    private long btsId;
    private long mrtId;

    public Place() {
    }

    public Place(String name, long btsId, long mrtId) {
        this.name = name;
        this.btsId = btsId;
        this.mrtId = mrtId;
    }

    public long getPlaceId() {
        return placeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBtsId() {
        return btsId;
    }

    public void setBtsId(long btsId) {
        this.btsId = btsId;
    }

    public long getMrtId() {
        return mrtId;
    }

    public void setMrtId(long mrtId) {
        this.mrtId = mrtId;
    }
}
