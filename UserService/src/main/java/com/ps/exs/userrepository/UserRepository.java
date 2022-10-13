package com.ps.exs.userrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ps.exs.userentity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

//	List<User> saveAll(User user);

}
