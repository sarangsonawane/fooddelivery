package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.dto.UserDto;
import com.example.repository.RestaurantRepository;
import com.example.service.RestaurantService;

@Controller
public class RestaurantController {

	@Autowired
	private RestaurantService resService;

	@Autowired
	private RestaurantRepository repository;

	
	
	// show restraurant
		@RequestMapping(value="/showu", method = RequestMethod.GET)
		public String servicesList(Model model) {
		    model.addAttribute("list1", resService.getallRestaurants());
		    return "ShowRestaurant";
		}

}
