package com.ps.exs.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.ps.exs.pentity.User;

@FeignClient(url="localhost:9090",name="UserClient")
public interface UserClient {
   @GetMapping("/GetUser")
   public List<User> AllUser();
}
