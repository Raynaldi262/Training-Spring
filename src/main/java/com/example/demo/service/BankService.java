package com.example.demo.service;

import com.example.demo.entity.Bank;

import java.util.List;

public interface BankService {
    List<Bank> banks();
    Bank findByFiid(String id);
    List<Bank> findByCodeOrID(String code, String id);
}
