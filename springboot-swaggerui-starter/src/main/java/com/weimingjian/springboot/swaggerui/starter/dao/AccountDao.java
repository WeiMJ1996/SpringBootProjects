package com.weimingjian.springboot.swaggerui.starter.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.weimingjian.springboot.swaggerui.starter.model.Account;

/**
 * @author weimingjian
 */
public interface AccountDao extends JpaRepository<Account, Long> {
}
