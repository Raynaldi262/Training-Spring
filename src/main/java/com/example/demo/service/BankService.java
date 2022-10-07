package com.example.demo.service;

import com.example.demo.entity.Bank;

import java.util.List;

public interface BankService {
    List<Bank> banks();
    Bank findByFiid(String id);
    Bank findByBankCode(String code);
}
