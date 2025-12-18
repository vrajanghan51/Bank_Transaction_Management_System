package com.example.Account.Controller;


import com.example.Account.Model.Account;
import com.example.Account.Model.Statement;
import com.example.Account.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @PostMapping("open-account")
    public void openAccount(@RequestBody Account account){
        accountService.openAccount(account);

    }

    @GetMapping("getamount")
    public Account Balence(@RequestHeader(name = "ac")long ac){
        return accountService.Balence(ac);
    }

}
