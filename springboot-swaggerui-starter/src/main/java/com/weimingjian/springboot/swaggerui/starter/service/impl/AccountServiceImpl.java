package com.weimingjian.springboot.swaggerui.starter.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weimingjian.springboot.swaggerui.starter.dao.AccountDao;
import com.weimingjian.springboot.swaggerui.starter.model.Account;
import com.weimingjian.springboot.swaggerui.starter.service.AccountService;

/**
 * @author weimingjian
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> getAllAccount() {
        return accountDao.findAll();
    }
}
