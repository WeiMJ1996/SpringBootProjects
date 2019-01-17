package com.weimingjian.springboot.mybatis.starter.dao;

import java.util.List;

import com.weimingjian.springboot.mybatis.starter.model.Account;

/**
 * @author weimingjian
 */
public interface AccountMapper {
    int insert(Account record);

    int insertSelective(Account record);

    List<Account> getAllAccount();
}