package com.example.BDC.repository;

import com.example.BDC.entity.food_data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface    DataRepository extends JpaRepository<food_data,Long> {
}
