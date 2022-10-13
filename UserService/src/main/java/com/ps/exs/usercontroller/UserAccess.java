package com.ps.exs.usercontroller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ps.exs.userentity.User;
import com.ps.exs.userserviceimpl.UserServiceImpl;

@RestController
@CrossOrigin("http://localhost:4200")
public class UserAccess {
	
	@Autowired
	UserServiceImpl userService;
	
	//This is used to add single user
	@PostMapping("/addUser")
	public String  addUser(@Valid @RequestBody User user) {
		return this.userService.addUser(user);	
    }
	
	//This method is used to add multiple user in single time
	@PostMapping("/addUsers")
	public List<User> addUsers(@Valid @RequestBody List<User> user){
		return this.userService.addUsers(user);	
	}
	
    // This method is used to get All record of user
	@GetMapping("/GetUser")
	public List<User> getRecord(){
		return this.userService.getRecord();
	}
	
	// This method is used delete for user record
	@DeleteMapping("/DeleteUser/{userId}")
	public Optional<String> removeUser(@Valid @PathVariable Integer userId) {
		return Optional.ofNullable(this.userService.removeRecord(userId));	
	}
	
    // This method is used for update user record 
	@PutMapping("/updateRecord/{userId}")
	public String updateUserRecord(@Valid@PathVariable Integer userId,@RequestBody User user) {
	    return this.userService.updateUserRecord(userId,user);
	}
}
