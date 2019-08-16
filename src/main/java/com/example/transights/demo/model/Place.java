package com.example.transights.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private long idBts;
    private long idMrt;

    public Place() {
    }

    public Place(String name, long idBts, long idMrt) {
        this.name = name;
        this.idBts = idBts;
        this.idMrt = idMrt;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getIdBts() {
        return idBts;
    }

    public void setIdBts(long idBts) {
        this.idBts = idBts;
    }

    public long getIdMrt() {
        return idMrt;
    }

    public void setIdMrt(long idMrt) {
        this.idMrt = idMrt;
    }
}
