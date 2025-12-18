package com.example.Account.Repository;

import com.example.Account.Model.Statement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StatementRepo extends JpaRepository<Statement,Integer> {
    List<Statement> getByAccNo(long accNo);
}
