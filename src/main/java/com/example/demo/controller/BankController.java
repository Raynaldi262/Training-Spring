package com.example.demo.controller;

import com.example.demo.entity.Bank;
import com.example.demo.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BankController {

    @Autowired
    private BankService srv;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }

    @GetMapping("/")
    public String index(Model model) {
        List<Bank> banks = srv.banks();
        model.addAttribute("banks",banks);

        return "admin/index";
    }
}
