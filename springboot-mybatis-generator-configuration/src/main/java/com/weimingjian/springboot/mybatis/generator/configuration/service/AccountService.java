package com.weimingjian.springboot.mybatis.generator.configuration.service;

import java.util.List;

import com.weimingjian.springboot.mybatis.generator.configuration.model.Account;

/**
 * @author weimingjian
 */
public interface AccountService {
    List<Account> getAllAccount();
    int addAccount(Account account);
}
