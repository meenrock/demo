package com.meenrock.demo.api.repository;

import com.meenrock.demo.api.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface FoodRepository extends JpaRepository<Food,Long> {
    List<Food> findFoodByName(String name);

    List<Food> findFoodByRestaurantId(int restaurantId);

    List<Food> findAllFood();

    Optional<Food> findFoodById(Long foodId);

    Long deleteFoodById(Long foodId);

}
