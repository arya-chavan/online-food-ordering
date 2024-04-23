package com.arya.Online.Food.Ordering.repository;

import com.arya.Online.Food.Ordering.model.IngredientsItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IngredientItemRepository extends JpaRepository<IngredientsItem,Long> {
List<IngredientsItem> findByRestaurantId(Long id);
}