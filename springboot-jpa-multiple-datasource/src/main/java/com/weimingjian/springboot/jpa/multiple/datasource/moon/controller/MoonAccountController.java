package com.weimingjian.springboot.jpa.multiple.datasource.moon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weimingjian.springboot.jpa.multiple.datasource.moon.model.MoonAccount;
import com.weimingjian.springboot.jpa.multiple.datasource.moon.service.MoonAccountService;

/**
 * @author weimingjian
 */
@RestController
@RequestMapping(value = "/moon/account")
public class MoonAccountController {
    @Autowired
    private MoonAccountService accountService;

    @GetMapping(value = "/all_moon_account")
    public List<MoonAccount> getAllMoonAccount() {
        return accountService.getAllAccount();
    }
}
