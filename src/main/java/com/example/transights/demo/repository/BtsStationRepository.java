package com.example.transights.demo.repository;

import com.example.transights.demo.model.BtsStation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BtsStationRepository extends JpaRepository<BtsStation, Long> {
}