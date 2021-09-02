package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.entity.User;
import com.example.service.RestaurantService;
import com.example.service.UserService;


@Controller
public class HomeController {
	
	@Autowired
	UserService service;
	
	@Autowired
	private RestaurantService resService;
	
//	controller for home page
	@GetMapping(value = {"/", "", "/index","/home"})
	public String Home(Model model)
	{
		 model.addAttribute("showcards", resService.getallRestaurants());
		return "index";
	}
	
	
//Controller to redirect  login page
	@RequestMapping("/login")
	public String Login()
	{
		
		return "login";
		
	}
	
// //Controller to redirect  registration page
	@RequestMapping("/reg")
	public String reg(Model model)
	{
		model.addAttribute("user",new User());
		return "Registration";
		
	}


// controller to validate role base user
	@PostMapping("/rolelogin")
	public ModelAndView processLogin(@RequestParam(value="email") String email, @RequestParam(value="password") String password ) {
		User user = service.authenticateUser(email, password);
				
		System.out.println(user);
			

		if(user!=null) {
		if(user.getRole().equalsIgnoreCase("Customer"))
		{
			return new ModelAndView("/Customer");
		
		}
		
		else if(user.getRole().equalsIgnoreCase("Restaurant")) {
			
			
			return new ModelAndView("/restaurant");
			
		}
		
		else if(user.getRole().equalsIgnoreCase("Delivery"))
		{
			return new ModelAndView("/delivery");
		}
		
		else if(user.getRole().equalsIgnoreCase("NGO"))
		{
			return new ModelAndView("ngo");
		}
				else return new ModelAndView("/login");
		}
		
		
		
		
		
		
		
		return new ModelAndView("/login");
	}
	
	
	
}

	

