package com.weimingjian.springboot.jpa.multiple.datasource.moon.service;

import java.util.List;

import com.weimingjian.springboot.jpa.multiple.datasource.moon.model.MoonAccount;

public interface MoonAccountService {
    List<MoonAccount> getAllAccount();
}
