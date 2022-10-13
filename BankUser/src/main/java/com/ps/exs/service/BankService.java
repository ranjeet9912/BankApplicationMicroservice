package com.ps.exs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ps.exs.model.BankModel;
import com.ps.exs.repo.BankRepository;
@Service
public class BankService {

	@Autowired
	BankRepository bankRepo;

	public BankModel openAccount(BankModel bankModel) {
		return this.bankRepo.save(bankModel);
	}

	public List<BankModel> allAccount() {
		return this.bankRepo.findAll();
	}

	public String closeAllcount(Integer accountNumber) {
	    this.bankRepo.deleteById(accountNumber);
	    String s=String.valueOf(accountNumber);
		String s2="Account Number is permanataly closed";
		String msg=s.concat(s2);
		return msg;
	}

	public BankModel updateAccountDetails(BankModel bankModel, Integer accountNumber) {

		return null;
	}

	public Optional<BankModel> findBtAcc(int accountNumber) {
		
		return this.bankRepo.findById(accountNumber);
	}

}
