package com.example.demo.controller;

import com.example.demo.entites.Account;
import com.example.demo.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "account")
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    public void saveAccount(@RequestBody Account accountSave){
        accountService.saveAccount(accountSave);
    }

    @GetMapping(path = "{AccountNumber}")
    public Account getAccountByNumber(@PathVariable("AccountNumber") Integer AccountNumber){
        return accountService.getAccountByNumber(AccountNumber);
    }

    @GetMapping(path = "all")
    public List<Account> getAccounts(){
        return accountService.getAccounts();
    }
}
