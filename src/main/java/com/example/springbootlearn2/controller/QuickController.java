package com.example.springbootlearn2.controller;


import com.example.springbootlearn2.dao.AccountDao;
import com.example.springbootlearn2.domain.Account;
import com.example.springbootlearn2.serivice.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
public class QuickController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/quick")
    public String quick(){
        return "Hello SpringBoot!";
    }

    @RequestMapping("/quick2")
    public List<Account> quick2(){
        System.out.println("web层方法执行...");
        return accountService.findAll();
    }

}
