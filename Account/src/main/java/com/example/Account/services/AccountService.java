package com.example.Account.services;

import com.example.Account.Model.Account;
import com.example.Account.Model.Statement;
import com.example.Account.Model.TypeEnum;
import com.example.Account.Repository.AccountRepo;
import com.example.Account.Repository.StatementRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    AccountRepo accountRepo;

    public void openAccount(Account account){
        accountRepo.save(account);
    }

    public Account Balence(long acno){
        return accountRepo.findById(acno).orElse(null);
    }
}
