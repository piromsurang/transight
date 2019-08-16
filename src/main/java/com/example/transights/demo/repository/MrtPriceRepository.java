package com.example.transights.demo.repository;

import com.example.transights.demo.model.MrtPrice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MrtPriceRepository extends JpaRepository<MrtPrice, Long> {
}
