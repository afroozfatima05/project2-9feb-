package com.collaborate.dao;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import com.collaborate.model.UserModel;

@ComponentScan("com")
@Repository

public interface UserDAO {
	
	public void addUser(UserModel userModel);

}
