package com.weimingjian.springboot.jpa.multiple.datasource.moon.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weimingjian.springboot.jpa.multiple.datasource.moon.dao.MoonAccountDao;
import com.weimingjian.springboot.jpa.multiple.datasource.moon.model.MoonAccount;
import com.weimingjian.springboot.jpa.multiple.datasource.moon.service.MoonAccountService;

@Service
public class MoonAccountServiceImpl implements MoonAccountService {
    @Autowired
    private MoonAccountDao accountDao;
    @Override
    public List<MoonAccount> getAllAccount() {
        return accountDao.findAll();
    }
}
