package com.example.transights.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MrtStation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idMrt;

    private String name;

    public MrtStation() {
    }

    public MrtStation(String name) {
        this.name = name;
    }

    public long getIdMrt() {
        return idMrt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
