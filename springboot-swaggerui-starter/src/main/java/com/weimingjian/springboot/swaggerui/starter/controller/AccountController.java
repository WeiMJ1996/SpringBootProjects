package com.weimingjian.springboot.swaggerui.starter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weimingjian.springboot.swaggerui.starter.model.Account;
import com.weimingjian.springboot.swaggerui.starter.service.AccountService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author weimingjian
 */
@RestController
@EnableSwagger2
@RequestMapping(value = "/account")
@Api(value = "account for swagger using", description = "account api", tags = "Account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping(value = "all_account_list")
    @ApiOperation(value = "获取所有账号",notes = "返回所有账号，返回结果为List")
    public List<Account> getAllAccount() {
        return accountService.getAllAccount();
    }
}
