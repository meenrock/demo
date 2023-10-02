package com.meenrock.demo.api.service;

import com.meenrock.demo.api.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.meenrock.demo.api.model.Food;
import java.util.List;
import java.util.Optional;

@Service
public class FoodService {
    private final FoodRepository foodRepository;

    @Autowired
    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public Optional<Food> getFoodById(Long id) {
        return foodRepository.findFoodById(id);
    }

    // Read all food items
    public List<Food> getAllFoods() {
        return foodRepository.findAll();
    }

    // Update an existing food item
    public Food updateFood(Food food) {
        return foodRepository.save(food);
    }

    // Delete a food item by its ID
    public void deleteFoodById(Long id) {
        foodRepository.deleteFoodById(id);
    }

}
