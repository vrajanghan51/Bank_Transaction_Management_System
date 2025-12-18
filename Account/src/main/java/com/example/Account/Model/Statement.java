package com.example.Account.Model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table (name = "statement")
public class Statement {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "t_id")
    private int tid;

    @Column
    private long accNo;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TypeEnum typeEnum;

    @Column(nullable = false)
    private double amount;


    @Column(nullable = false)
    private LocalDateTime date;

    public Statement() {
    }

    public Statement(long accNo, double amount, TypeEnum typeEnum) {
        this.accNo = accNo;
        this.amount= amount;
        this.typeEnum = typeEnum;
        this.date = LocalDateTime.now();
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public long getAccNo() {
        return accNo;
    }

    public void setAccNo(long accNo) {
        this.accNo = accNo;
    }

    public TypeEnum getTypeEnum() {
        return typeEnum;
    }

    public void setTypeEnum(TypeEnum typeEnum) {
        this.typeEnum = typeEnum;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
