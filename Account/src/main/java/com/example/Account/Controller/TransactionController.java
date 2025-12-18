package com.example.Account.Controller;

import com.example.Account.Model.Statement;
import com.example.Account.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("transafer")
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    @PostMapping("deposit")
    public String Deposit(@RequestHeader(name = "acno")long acno,@RequestHeader(name = "amount")double amount){
        return transactionService.Deposit(acno, amount);
    }

    @PostMapping("withdraw")
    public String Withdraw(@RequestHeader(name = "acno")long acno,@RequestHeader(name = "amount")double amount){
        return transactionService.Withdraw(acno, amount);
    }

    @PutMapping("transafer")
    public String Transafer(@RequestHeader(name = "facno")long facno, @RequestHeader(name = "sacno")long sacno, @RequestHeader(name = "amount")double amount){
        return transactionService.Transafer(facno, sacno, amount);
    }

    @GetMapping("statement")
    public List<Statement> getByAccNo(@RequestHeader(name = "ac")long ac){
        return transactionService.getByAccNo(ac);
    }

}
