package com.example.cricketService;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CricketRepository extends JpaRepository<Cricket,Long> {
}