package com.arya.Online.Food.Ordering.repository;

import com.arya.Online.Food.Ordering.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoodRepository extends JpaRepository<Food,Long> {
    // List<Food>;
}
