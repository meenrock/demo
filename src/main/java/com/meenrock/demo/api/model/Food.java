package com.meenrock.demo.api.model;

public class Food {
    private Long food_id;
    private String food_name;
    private int food_price;
    private int restaurant_id;
    private int food_type_id;

    public Food(Long foodId, String foodName, int foodPrice, int restaurantId, int foodTypeId) {
        this.food_id = foodId;
        this.food_name = foodName;
        this.food_price = foodPrice;
        this.restaurant_id = restaurantId;
        this.food_type_id = foodTypeId;
    }

    public Long getFoodId() {
        return food_id;
    }

    public String getFoodName(long foodId) {
        return food_name;
    }

    public int getFoodPrice(int foodId) {
        return food_price;
    }

    public int getFoodRestaurantId(int restaurantId) {
        return restaurant_id;
    }




}
