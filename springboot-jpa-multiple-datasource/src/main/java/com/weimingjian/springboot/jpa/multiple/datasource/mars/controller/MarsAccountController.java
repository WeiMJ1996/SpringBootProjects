package com.weimingjian.springboot.jpa.multiple.datasource.mars.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weimingjian.springboot.jpa.multiple.datasource.mars.model.MarsAccount;
import com.weimingjian.springboot.jpa.multiple.datasource.mars.service.MarsAccountService;

/**
 * @author weimingjian
 */
@RestController
@RequestMapping(value = "/mars/account")
public class MarsAccountController {
    @Autowired
    private MarsAccountService accountService;

    @GetMapping(value = "/all_mars_account")
    public List<MarsAccount> getAllMarsAccount() {
        return accountService.getAllAccount();
    }
}
