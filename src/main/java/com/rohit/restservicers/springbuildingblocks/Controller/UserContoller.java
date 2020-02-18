package com.rohit.restservicers.springbuildingblocks.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rohit.restservicers.springbuildingblocks.Entites.User;
import com.rohit.restservicers.springbuildingblocks.Services.UserService;

@RestController
public class UserContoller {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User>getAllUsers(){
		return userService.getAllUsers();
	
	}
	@PostMapping("/createUser")
	public User createUiser(@RequestBody User user){
		return userService.createUser(user);
	
 }
	@GetMapping("/users/{id}")
	public Optional<User> getUserById(@PathVariable ("id") Long id){
	
	 return userService.getUserById(id);
	
	}
	@PutMapping("/updateUsers/{id}")
	public User UpdateUserById(@PathVariable ("id") Long id, @RequestBody User user ){
		
		 return userService.UpdateUserbyId(id, user);
		
}
	@DeleteMapping("/deleteUsers/{id}")
	public void deleteUserById(@PathVariable ("id") Long id){
		userService.deleteUserById(id);
		
	}
	
	@GetMapping("/getUserByUserName/{username}")
	public User getUserByUserName(@PathVariable ("username") String username){
		return userService.getUserByUserName(username);
	}
}
