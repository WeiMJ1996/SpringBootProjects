package com.weimingjian.springboot.mybatis.starter.controller;

import java.util.List;

import com.weimingjian.springboot.mybatis.starter.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weimingjian.springboot.mybatis.starter.model.Account;

/**
 * @author weimingjian
 */
@Slf4j
@RestController
@RequestMapping(value = "/account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @GetMapping(value = "all_account_list")
    public List<Account> getAllAccount() {
        System.out.println("get all account");
        log.info("get all account...from log");
        return accountService.getAllAccount();
    }
}
