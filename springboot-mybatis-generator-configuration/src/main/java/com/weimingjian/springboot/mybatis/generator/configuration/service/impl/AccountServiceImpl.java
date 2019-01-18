package com.weimingjian.springboot.mybatis.generator.configuration.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weimingjian.springboot.mybatis.generator.configuration.dao.AccountMapper;
import com.weimingjian.springboot.mybatis.generator.configuration.model.Account;
import com.weimingjian.springboot.mybatis.generator.configuration.service.AccountService;

/**
 * @author weimingjian
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;
    @Override
    public List<Account> getAllAccount() {
        return accountMapper.selectAll();
    }

    @Override
    public int addAccount(Account account) {
        return accountMapper.insert(account);
    }
}
