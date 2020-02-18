package com.rohit.restservicers.springbuildingblocks.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rohit.restservicers.springbuildingblocks.Entites.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	//List<User> findAll();
	public User findByUsername(String username);
		
		
	
	
}
