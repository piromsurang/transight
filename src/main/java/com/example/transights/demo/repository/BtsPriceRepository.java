package com.example.transights.demo.repository;

import com.example.transights.demo.model.BtsPrice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BtsPriceRepository extends JpaRepository<BtsPrice, Long> {
}
