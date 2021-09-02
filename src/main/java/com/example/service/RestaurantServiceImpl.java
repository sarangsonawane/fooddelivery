package com.example.service;

import java.sql.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.UserDto;
import com.example.entity.DeliveryBoy;
import com.example.entity.Ngo;
import com.example.entity.Restaurant;
import com.example.entity.User;
import com.example.repository.RestaurantRepository;

@Service
@Transactional
public class RestaurantServiceImpl implements RestaurantService
{
	@Autowired
	private RestaurantRepository restaurantRepo;;

	@Override
	public List<Restaurant> getallRestaurants() {

		return restaurantRepo.findAll();
	}
	
	
	
			 
}
	 
	
	
	
	

