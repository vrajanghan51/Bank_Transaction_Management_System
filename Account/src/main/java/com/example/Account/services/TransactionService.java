package com.example.Account.services;

import com.example.Account.Model.Account;
import com.example.Account.Model.Statement;
import com.example.Account.Model.TypeEnum;
import com.example.Account.Repository.AccountRepo;
import com.example.Account.Repository.StatementRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    AccountRepo accountRepo;

    @Autowired
    StatementRepo statementRepo;

    public List<Statement> getByAccNo(long ac){
        return statementRepo.getByAccNo(ac);
    }

    public String Deposit(long acno,double amount) {
        Account ac = accountRepo.findById(acno).orElse(null);

        if(null==ac){
            return "Error : account not found";
        }

        ac.setAmount(ac.getAmount()+amount);
        accountRepo.save(ac);

        Statement statement = new Statement(acno,amount, TypeEnum.DEPOSIT);
        statementRepo.save(statement);

        return "Deposit successful! New Balance: ₹" + ac.getAmount();
    }

    public String Withdraw(long acno,double amount) {
        Account ac = accountRepo.findById(acno).orElse(null);
        if(null==ac){
            return "Error : account not found";
        }
        if(amount>ac.getAmount()){
            return "Error : insuficient amount";
        }
        ac.setAmount(ac.getAmount()-amount);
        accountRepo.save(ac);

        Statement statement = new Statement(acno,amount,TypeEnum.WITHDRAW);
        statementRepo.save(statement);

        return "Withdrawal successful! New Balance: ₹" + ac.getAmount();
    }

    public String Transafer(long acno1,long acno2,double amount){
        Account ac1 = accountRepo.findById(acno1).orElse(null);
        Account ac2 = accountRepo.findById(acno2).orElse(null);

        if(null== ac1 || null== ac2){
            return "Error : account not found";
        }
        if(amount> ac1.getAmount()){
            return "Error : insuficient amount";
        }

        Withdraw(acno1,amount);
        Deposit(acno2,amount);
        return "Transfer successful!";
    }

}
