package com.meenrock.demo.api.repository;

import com.meenrock.demo.api.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface FoodRepository extends JpaRepository<Food,Long> {
    List<Food> findFoodByName(String name);

    List<Food> findFoodByRestaurantId(int restaurantId);

}
