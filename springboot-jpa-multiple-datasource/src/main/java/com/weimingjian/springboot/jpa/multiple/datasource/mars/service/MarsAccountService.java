package com.weimingjian.springboot.jpa.multiple.datasource.mars.service;

import java.util.List;

import com.weimingjian.springboot.jpa.multiple.datasource.mars.model.MarsAccount;

/**
 * @author weimingjian
 */
public interface MarsAccountService {
    List<MarsAccount> getAllAccount();
}
