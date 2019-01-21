package com.weimingjian.springboot.jpa.multiple.datasource.mars.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weimingjian.springboot.jpa.multiple.datasource.mars.model.MarsAccount;

/**
 * @author weimingjian
 */
public interface MarsAccountDao extends JpaRepository<MarsAccount, Long> {
}
