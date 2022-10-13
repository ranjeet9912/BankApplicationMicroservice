package com.ps.exs.pcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ps.exs.pentity.BankModel;
import com.ps.exs.pentity.User;
import com.ps.exs.pservice.PassbookService;

@RestController
public class PassbookController {
			@Autowired
			
			private PassbookService passbookService;
			
			@GetMapping("/Account")
			public List<BankModel> account(){
				return passbookService.getAll();
			}
			
			@GetMapping("/Account/{accountNumber}")
				public BankModel getByAcc(@PathVariable int accountNumber) {
					return passbookService.getByAcc(accountNumber);
			}
			@GetMapping("/AllUser")
			public List<User> AllUser(){
				return passbookService.AllUser();
			}
			
		
			
}
