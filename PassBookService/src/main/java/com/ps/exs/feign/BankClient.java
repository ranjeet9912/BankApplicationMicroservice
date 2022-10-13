package com.ps.exs.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ps.exs.pentity.BankModel;

@FeignClient(url="localhost:9091",name="BankClient")
public interface BankClient {
	 @GetMapping("/AllAccount")
     public List<BankModel> getAll();
    @GetMapping("/findByacc/{accountNumber}")
	public BankModel getBtAcc(@PathVariable int accountNumber);
   

}
