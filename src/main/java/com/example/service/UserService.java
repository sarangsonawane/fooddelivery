package com.example.service;

import com.example.dto.UserDto;
import com.example.entity.User;

public interface UserService {

	void saveuser(UserDto userdto);

	User authenticateUser(String email, String password);

}
