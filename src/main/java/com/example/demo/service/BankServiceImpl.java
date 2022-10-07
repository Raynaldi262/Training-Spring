package com.example.demo.service;

import com.example.demo.entity.Bank;
import com.example.demo.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankServiceImpl implements BankService {

    @Autowired
    private BankRepository repo;

    @Override
    public List<Bank> banks() {
        return repo.findAll();
    }

    @Override
    public Bank findByFiid(String bankFiid) {
        return repo.findBybankFiid(bankFiid);
    }

    @Override
    public Bank findByBankCode(String code) {
        return repo.findById(code).get();
    }
}
