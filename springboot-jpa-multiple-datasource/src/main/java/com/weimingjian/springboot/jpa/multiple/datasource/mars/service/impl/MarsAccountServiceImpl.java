package com.weimingjian.springboot.jpa.multiple.datasource.mars.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weimingjian.springboot.jpa.multiple.datasource.mars.dao.MarsAccountDao;
import com.weimingjian.springboot.jpa.multiple.datasource.mars.model.MarsAccount;
import com.weimingjian.springboot.jpa.multiple.datasource.mars.service.MarsAccountService;

/**
 * @author weimingjian
 */
@Service
public class MarsAccountServiceImpl implements MarsAccountService {
    @Autowired
    private MarsAccountDao accountDao;
    @Override
    public List<MarsAccount> getAllAccount() {
        return accountDao.findAll();
    }
}
