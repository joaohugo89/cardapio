package com.hugo.cardapio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hugo.cardapio.food.Food;

public interface FoodRepository extends JpaRepository<Food, Long> {
    
}
