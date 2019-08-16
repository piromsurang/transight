package com.example.transights.demo.repository;

import com.example.transights.demo.model.Place;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceRepository extends JpaRepository<Place, Long> {
}
