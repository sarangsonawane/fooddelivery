package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.dto.UserDto;
import com.example.entity.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Integer>
{

	/* @Query("from User u  where u.role = 'Restuarant'") */
	/* List<Object> displayRes(); */
	
	
	

}
