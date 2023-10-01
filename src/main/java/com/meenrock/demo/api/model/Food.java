package com.meenrock.demo.api.model;

public class Food {
    private int food_id;
    private String food_name;
    private int food_price;
    private int restaurant_id;
    private int food_type_id;

    public Food(int foodId, String foodName, int foodPrice, int restaurantId, int foodTypeId) {
        this.food_id = foodId;
        this.food_name = foodName;
        this.food_price = foodPrice;
        this.restaurant_id = restaurantId;
        this.food_type_id = foodTypeId;
    }
}
