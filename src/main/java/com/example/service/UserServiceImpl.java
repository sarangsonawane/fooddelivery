package com.example.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.UserDto;
import com.example.entity.DeliveryBoy;
import com.example.entity.Ngo;
import com.example.entity.Restaurant;
import com.example.entity.User;
import com.example.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userepo;

	@Override
	public void saveuser(UserDto userdto) {
		
		
		
		User user = new User(userdto.getFirstName(), userdto.getLastName(), userdto.getEmail(),
				userdto.getMobileNo(), userdto.getGender(), userdto.getAddress(), userdto.getCity(), 
				userdto.getState(), userdto.getPinCode(), userdto.getPassword(),userdto.getDate(),
				userdto.getRole());
		
		if(user.getRole().equalsIgnoreCase("Restuarant")) {
			Restaurant restaurant = new Restaurant(userdto.getRestaurantName(),userdto.getLicenseNo(),userdto.getCateogry(),userdto.getRestaurantType(),userdto.getRestaurantImage());
					user.setRestaurant(restaurant);
					restaurant.setUser(user);
	
		}
		
		if(user.getRole().equalsIgnoreCase("Ngo")) {
			Ngo ngo = new Ngo(userdto.getNgoName(),userdto.getNgoRegistrationNo(),userdto.getBankAccountNumber());
					user.setNgo(ngo);
					ngo.setUser(user);
	
		}
		
		if(user.getRole().equalsIgnoreCase("Delivery")) {
		System.out.println(userdto.getAdharNo());
//			long adhar = Long.parseLong(userdto.getAdharNo());
			DeliveryBoy deliveryboy = new DeliveryBoy(userdto.getAdharNo(),userdto.getDrivingLicese());
					user.setDeliveryboy(deliveryboy);
					deliveryboy.setUser(user);
	
		}
		
		userepo.save(user);

	}

	@Override
	public User authenticateUser(String email, String password) {
		
		User checkUser = userepo.findByEmailAndPassword(email,password);

		return checkUser;
	}
	
	
	

}





