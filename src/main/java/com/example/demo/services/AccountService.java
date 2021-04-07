package com.example.demo.services;

import com.example.demo.dao.AccountRepository;
import com.example.demo.entites.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public void saveAccount(Account accountSave) {
        accountRepository.save(accountSave);
    }

    public Account getAccountByNumber(Integer AccountNumber){
        return accountRepository.findByAccountNumber(AccountNumber) ;
    }

    public List<Account> getAccounts(){
        return accountRepository.findAll();
    }
}
