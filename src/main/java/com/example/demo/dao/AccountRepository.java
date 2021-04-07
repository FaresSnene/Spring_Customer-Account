package com.example.demo.dao;


import com.example.demo.entites.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountRepository extends JpaRepository<Account ,Integer> {

    Account findByAccountNumber(Integer AccountNumber);
}
