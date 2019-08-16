package com.example.transights.demo.repository;

import com.example.transights.demo.model.MrtStation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MrtStationRepository extends JpaRepository<MrtStation, Long> {
}

