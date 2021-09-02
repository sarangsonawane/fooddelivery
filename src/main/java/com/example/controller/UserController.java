package com.example.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.example.dto.UserDto;
import com.example.entity.Restaurant;
import com.example.entity.User;
import com.example.repository.RestaurantRepository;
import com.example.repository.UserRepository;
import com.example.service.RestaurantService;
import com.example.service.RestaurantServiceImpl;
import com.example.service.UserService;

@Controller

public class UserController {

	
//	controller method for home page
	@Autowired
	private UserService service;
	
	/*
	 * @Autowired private UserRepository userrepo;
	 * 
	 * @Autowired private RestaurantRepository restRepo;
	 */
	@Autowired
	private RestaurantService restServiceRepo;


	
	
//	 controller to insert data
	
	@PostMapping("/register")
	public String insert(@ModelAttribute UserDto user,Model model)
	{
		service.saveuser(user);
		return "index";
	}
	
	
	
	
	

	
	
}
