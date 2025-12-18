package com.example.Account.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Random;

@Entity
@Table (name = "account")
public class Account {

    @Id
    @Column (name = "acc_no")
    private long accNo;

    @Column
    private double amount;

    @Column
    private String name;

    public Account() {
        this.accNo = generateUniqueAccountNumber();
    }

    public Account(double amount, String name) {
        this.amount = amount;
        this.name = name;
        this.accNo = generateUniqueAccountNumber();
    }

    private long generateUniqueAccountNumber() {
        Random random = new Random();
        return 1_000_000_000L + (long)(random.nextDouble() * 9_000_000_000L);
    }

    public long getAccNo() {
        return accNo;
    }

    public void setAccNo(long accNo) {
        this.accNo = accNo;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
