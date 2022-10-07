package com.example.demo.repository;

import com.example.demo.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BankRepository extends JpaRepository
        <Bank, String> {
    Bank findBybankFiid(String bankFiid);

    @Query(value = "Select * from rs_bank where bank_code = ?1 or bank_id = ?2", nativeQuery = true)
    List<Bank> findByBankCodeOrID(String bankCode, String bankId);

}
