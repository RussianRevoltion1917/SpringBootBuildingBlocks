package com.rohit.restservicers.springbuildingblocks.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.rohit.restservicers.springbuildingblocks.Entites.User;
import com.rohit.restservicers.springbuildingblocks.Repositories.UserRepository;

import java.util.List;
import java.util.Optional;


@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUsers(){
		
		return userRepository.findAll();
		
	}

	public User createUser(User user) {
		return userRepository.save(user);
		
	}
	
	public Optional<User> getUserById(Long id){
		Optional<User> user= userRepository.findById(id);
		return user;
	}
		
	public User UpdateUserbyId(Long id,User user){
		user.setId(id);
		return userRepository.save(user);
		
	}
	
	public void deleteUserById(Long id){
		if(userRepository.findById(id).isPresent()){
			userRepository.deleteById(id);
		}
			
	}
	
	public User getUserByUserName(String username){
		return userRepository.findByUsername(username);
	}
	
		
}



