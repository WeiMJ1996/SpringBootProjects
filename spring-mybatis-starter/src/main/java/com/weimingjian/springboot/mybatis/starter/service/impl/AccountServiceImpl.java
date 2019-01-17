package com.weimingjian.springboot.mybatis.starter.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weimingjian.springboot.mybatis.starter.dao.AccountMapper;
import com.weimingjian.springboot.mybatis.starter.model.Account;
import com.weimingjian.springboot.mybatis.starter.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;
    @Override
    public List<Account> getAllAccount() {
        return accountMapper.getAllAccount();
    }
}
