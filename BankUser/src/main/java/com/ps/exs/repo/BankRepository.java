package com.ps.exs.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ps.exs.model.BankModel;
@Repository

public interface BankRepository extends JpaRepository<BankModel,Integer> {

}
