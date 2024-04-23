package com.arya.Online.Food.Ordering.service;

import com.arya.Online.Food.Ordering.model.IngredientCategory;
import com.arya.Online.Food.Ordering.model.IngredientsItem;

import java.util.List;

public interface IngredientsService {
    public IngredientCategory createIngredientCategory(String name,Long restaurantId)throws Exception;
    public IngredientCategory findIngredientCategoryById(Long id)throws Exception;
    public List<IngredientCategory> findIngredientCategoryByRestaurantId(Long id)throws Exception;
    public IngredientsItem createIngredientsItem(Long restaurantId,String ingredientName,Long categoryId)throws Exception;
    public List<IngredientsItem> findRestaurantsIngredients(Long restaurantId);
    public IngredientsItem updateStock(Long id)throws Exception;

}
