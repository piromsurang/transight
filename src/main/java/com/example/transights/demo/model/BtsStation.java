package com.example.transights.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BtsStation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idBtsStation;

    private String name;

    public BtsStation() {
    }

    public BtsStation(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getIdBtsStation() {
        return idBtsStation;
    }

    public String getName() {
        return name;
    }
}
