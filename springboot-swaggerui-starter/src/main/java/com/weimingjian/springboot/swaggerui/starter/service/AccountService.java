package com.weimingjian.springboot.swaggerui.starter.service;

import java.util.List;

import com.weimingjian.springboot.swaggerui.starter.model.Account;


/**
 * @author weimingjian
 */
public interface AccountService {
    /**
     * get account list
     * @return AccountList
     */
    List<Account> getAllAccount();
}
