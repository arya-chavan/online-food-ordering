package com.arya.Online.Food.Ordering.repository;

import com.arya.Online.Food.Ordering.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FoodRepository extends JpaRepository<Food,Long> {
    List<Food> findByRestaurantId(Long restaurantId);
    @Query("SELECT f FROM Food f WHERE f.name LIKE %:Keyword% OR f.foodCategory.name LIKE %:Keyword%")
    List<Food>searchFood(@Param("Keyword")String Keyword);

}
