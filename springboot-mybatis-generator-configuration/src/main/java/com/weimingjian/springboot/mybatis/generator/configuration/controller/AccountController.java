package com.weimingjian.springboot.mybatis.generator.configuration.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.weimingjian.springboot.mybatis.generator.configuration.model.Account;
import com.weimingjian.springboot.mybatis.generator.configuration.service.AccountService;

import lombok.extern.slf4j.Slf4j;

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
        return accountService.getAllAccount();
    }

    @GetMapping(value = "account_list")
    public PageInfo<Account> getAccountList() {
        return PageHelper.startPage(1, 5).setOrderBy("update_time desc").doSelectPageInfo(() -> accountService.getAllAccount());
    }

    @PostMapping(value = "add_account")
    public Map<String, Integer> addAccount(@RequestBody Account account) {
        Map<String, Integer> result = new HashMap<>();
        result.put("result", accountService.addAccount(account));
        return result;
    }
}
