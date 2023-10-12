package com.meenrock.spring.jpa.postgresql.model;

import jakarta.persistence.*;

@Entity(name = "joyjoydevelopment")
@Table(name = "food")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long foodId;

    @Column(name = "food_name")
    private String foodName;

    @Column(name = "food_price")
    private int foodPrice;

    @Column(name = "restaurant_id")
    private int restaurantId;

    @Column(name = "food_type_id")
    private int foodTypeId;

    public Food(Long food_id, String food_name, int food_price, int restaurant_id, int food_type_id) {
        this.foodId = food_id;
        this.foodName = food_name;
        this.foodPrice = food_price;
        this.restaurantId = restaurant_id;
        this.foodTypeId = food_type_id;
    }

    public Long getFoodId() {
        return foodId;
    }

    public void setFoodId(Long food_id) {
        this.foodId = food_id;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String food_name) {
        this.foodName = food_name;
    }

    public int getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(int food_price) {
        this.foodPrice = food_price;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurant_id) {
        this.restaurantId = restaurant_id;
    }

    public  int getFoodTypeId() { return foodTypeId; }

    public void setFoodTypeId(int food_type_id) {
        this.foodTypeId = food_type_id;
    }

    @Override
    public String toString() {
        return "Tutorial [food_id=" + foodId + ", food_name=" + foodName + ", food_price=" + foodPrice + ", restaurant_id=" + restaurantId + ", food_type_id=" + foodTypeId + "]";
    }




}
