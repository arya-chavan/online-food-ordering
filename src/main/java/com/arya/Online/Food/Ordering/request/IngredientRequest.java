package com.arya.Online.Food.Ordering.request;

import lombok.Data;

@Data
public class IngredientRequest {
    private String name;
    private Long categoryId;
    public Long restaurantId;
}
