package com.ps.exs.controller;

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

import com.ps.exs.model.BankModel;
import com.ps.exs.service.BankService;

@RestController
public class BankController {
	@Autowired
	BankService bankService;

	@PostMapping("/OpenAcc")
	public BankModel openAccount(@RequestBody BankModel bankModel) {
		System.out.println("This is controller");
		return this.bankService.openAccount(bankModel);

	}
	@GetMapping("AllAccount")
	public List<BankModel>  allAccount(){
		System.out.println("in tha BankUser");
		return this.bankService.allAccount();
		
	}
	@GetMapping("findByacc/{accountNumber}")
	public Optional<BankModel>  findByAcc(@PathVariable int accountNumber){
		return this.bankService.findBtAcc(accountNumber);	
	}

	@PutMapping("/upadte/{accountNumber}")
	public BankModel updateAccountDetails(@RequestBody BankModel bankModel,@PathVariable Integer accountNumber) {

		return this.bankService.updateAccountDetails(bankModel,accountNumber);

	}

	@DeleteMapping("/delete/{accountNumber}")
	public String closeAccount(@PathVariable Integer accountNumber) {
		this.bankService.closeAllcount(accountNumber);
		return " ";
	}


}
