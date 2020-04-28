package com.example.customerservices;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository  extends JpaRepository<FoodOrder, Integer>{

}
