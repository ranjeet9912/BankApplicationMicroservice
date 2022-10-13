package com.ps.exs.userserviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ps.exs.userentity.BankModel;
import com.ps.exs.userentity.Result;
import com.ps.exs.userentity.User;
import com.ps.exs.userrepository.UserRepository;
@Service
public class UserServiceImpl {
	
	@Autowired
	
	UserRepository userRepo;
    // This is for add user
	public String addUser(User user) {
		this.userRepo.save(user);
		String name=user.getUserName();
		String msg=name+" "+user.getUserId()+" User is Successfully Inserted";
		return msg;
	}
    //This is for get all record of users
	public List<User> getRecord() {
		return this.userRepo.findAll();
	}
    // This is for delete record from the User Database
	public String removeRecord(Integer userId) {
		if(userRepo.findById(userId) != null) {
			this.userRepo.deleteById(userId);
			String S="Record is deleted for UserId "+userId+"";
			return S;
			}
		else {
			return "Given User id data is not present";
			}
	}
	
    //This is for Save Multiple users at single time
	public List<User> addUsers(List<User> user) {
		return this.userRepo.saveAll(user);
	}

	public String updateUserRecord(Integer userId, User user) {	
		if(userRepo.existsById(userId)==true){
			userRepo.save(user);
			return "your Record is upadted for :"+userId+"";
		}else {
			return "The Given userId not found pls check and Retry for update";
		}
	}
//	public Result getR() {
//		// Bank service properties setting
//		
//		return result;
//	}

}
