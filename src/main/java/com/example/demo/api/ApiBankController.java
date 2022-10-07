package com.example.demo.api;

import com.example.demo.entity.Bank;
import com.example.demo.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class ApiBankController {
    @Autowired
    private BankService srv;

    @GetMapping("/bank")
    private List<Bank> index(){
        return srv.banks();
    }

    @GetMapping("/bank/{id}")
    private Bank getById(@PathVariable String id){
        return srv.findByFiid(id);
    }

    @GetMapping("/bank/{code}/{id}")
    private List<Bank> getById(@PathVariable(name = "code") String code, @PathVariable(name = "id") String id){
        return srv.findByCodeOrID(code, id);
    }
}
