package com.ps.exs.pservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ps.exs.feign.BankClient;
import com.ps.exs.feign.UserClient;
import com.ps.exs.pentity.BankModel;
import com.ps.exs.pentity.User;

@Service

public class PassbookService {
	@Autowired
	private BankClient bankClient;
	@Autowired
	private UserClient userClient;
   
	public List<BankModel> getAll() {
		return bankClient.getAll();
	}

	public BankModel getByAcc(int accountNumber) {
		return bankClient.getBtAcc(accountNumber);
	}

	public List<User> AllUser() {
		return userClient.AllUser() ;
	}


}
